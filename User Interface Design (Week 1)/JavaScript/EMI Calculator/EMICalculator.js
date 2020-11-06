const _principalAmount = document.getElementById("principalAmount");
const _interestRateYear = document.getElementById("interestRate");
const _tenureMonth = document.getElementById("tenure");
const _result = document.getElementById("result");

function calculateEMI() {
    const principalAmount = Number(_principalAmount.value);
    const interestRateYear = Number(_interestRateYear.value);
    const interestRateMonth = Number(interestRateYear / 1200);
    const tenureMonth = Number(_tenureMonth.value);

    const emi = getEmiReducing(principalAmount, tenureMonth, interestRateMonth);
    _result.innerText = "EMI is Rs." + emi.toFixed(2);

    return false;
}

function getEmiReducing(P, N, R) {
    return (P * R * (Math.pow((1 + R), N) / (Math.pow((1 + R), N) - 1)));
}