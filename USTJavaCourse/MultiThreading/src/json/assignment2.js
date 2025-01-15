// Problem Statement 02
// JavaScript: How to construct an array of json objects using map.
// Show the output:
// 1. creates a new array with the results of calling a function on every element in the calling array.
// 2. written as key/ value pairs using Json object.
// 3. JSON object says “orders” with lot of keys like name, description, date, status.
// 4. Convert Json file into the JavaScript file.
// 5. Get the final output of this program.
// Performance Outcomes:
// Upon successful completion of the assignment, the participant is well versed in
// 3. Implement the more futures of to this program.
// 4. User able to fix the debugging errors  A Quik Introduction to JavaScript json

// Input Array
const ordersArray = [
  {
    id: 1,
    name: "Order 1",
    description: "First Order",
    date: "2025-01-13",
    status: "Pending",
  },
  {
    id: 2,
    name: "Order 2",
    description: "Second Order",
    date: "2025-01-12",
    status: "Completed",
  },
];

// 1. Create a new array with additional information
const updatedOrders = ordersArray.map((order) => ({
  ...order,
  priority: order.status === "Pending" ? "High" : "Low",
}));

console.log("Updated Orders with Priority:", updatedOrders);

// 2. Convert the updated orders to JSON string format
const jsonString = JSON.stringify(updatedOrders, null, 2);
console.log("JSON String of Updated Orders:", jsonString);
