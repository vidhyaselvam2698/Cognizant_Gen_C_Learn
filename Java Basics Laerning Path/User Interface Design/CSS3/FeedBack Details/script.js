const feedbackTextArea = document.getElementById("feedback");
const container = document.getElementById("container");
const result = document.getElementById("result");
const feedbacks = [];

function addFeedback() {
    const feedback = feedbackTextArea.value;
    feedbacks.push(feedback);
    container.style.alignSelf = "flex-end";
    result.innerHTML = "<h2>Feedback Details</h2><p><strong>Sussessfully Added Feedback Details!</strong></p>";
}

function displayFeedback() {
    var feedbackText = "";

    for (var i = 0; i < feedbacks.length; ++i) {
        if (i !== 0) {
            feedbackText += "<br>";
        }

        feedbackText += "Feedback " + (i + 1) + "<br>" + feedbacks[i] + "";
    }

    result.innerHTML = "<h2>Feedback Details</h2>" + "<p>" +
        feedbackText +
        "</p>";
}