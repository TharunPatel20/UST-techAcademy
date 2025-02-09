// A Quik Introduction to JavaScript json
// Problem Statement 01
// Example, we have two company objects inside a JSON array, Learn How to Use JSON with JavaScript
// Show the output:
// 1. We have two company objects inside a JSON array.
// 2. Get a JSON as a string rather than a JSON object.
// 3. Represent the JSON as a string inside JavaScript.
// 4. Inspect the console log in Chrome Developer Tools.
// 5. Convert Json file into the JavaScript file .
// 6. Get the final output of this program.
// Performance Outcomes:
// Upon successful completion of the assignment, the participant is well versed in
// 1. Implement the more futures of to this program.
// 2. User able to fix the debugging errors.
// JSON Array with two company objects

const companies = [
  {
    name: "TechCorp",
    industry: "Technology",
    employees: 200,
  },
  {
    name: "EcoGoods",
    industry: "Retail",
    employees: 50,
  },
];

// 1. Get JSON as a string
const jsonString = JSON.stringify(companies);
console.log("JSON as a String:", jsonString);

// 2. Represent JSON as a string inside JavaScript
const jsonStringRepresentation =
  '[{"name":"TechCorp","industry":"Technology","employees":200},{"name":"EcoGoods","industry":"Retail","employees":50}]';
console.log("JSON String Representation:", jsonStringRepresentation);

// 3. Convert JSON back to a JavaScript object
const jsonObject = JSON.parse(jsonString);
console.log("Converted JSON to JavaScript Object:", jsonObject);
