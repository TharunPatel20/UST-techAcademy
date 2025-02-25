const transactions = [
  { type: "deposit", amount: 1000 },
  { type: "withdraw", amount: 2000 },
  { type: "deposit", amount: 1000 },
  { type: "withdraw", amount: 100 },
  { type: "deposit", amount: 1400 },
];

function getTransactions(transactionType) {
  let transactionsList = "";

  transactionsList = typeOfTransactions(transactionType, transactionsList);
  document.getElementById("transactionList").innerHTML = transactionsList;
}

function typeOfTransactions(transactionType, transactionsList) {
  transactions.forEach((transaction) => {
    if (transaction.type === transactionType || transactionType === "all") {
      transactionsList += `<li class="${transaction.type}"> ${transaction.amount}</li>`;
    }
  });

  return transactionsList;
}

window.onload = () => getTransactions("all");
