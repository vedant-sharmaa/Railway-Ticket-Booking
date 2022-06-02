// Form Submit Button DOM
let submitBtn = document.querySelector("#submit");

// Adding event listener to form submit button
submitBtn.addEventListener('click', (event) => {

   // Preventing form to submit
   event.preventDefault(); //stops page from reloading

   // Fetching Form data
   let ticketid = document.getElementById('ticketid').value;
   let name = document.getElementById('name').value;
   let seatnumber = document.getElementById('seatnumber').value;
   let price = document.getElementById('price').value;
   let paymentid = document.getElementById('paymentid').value;
   let status = document.getElementById('status').value;
   const url = 'http://localhost:8080/booking'
   const callback = (response) => {
        console.log(response);
   }
   const data = {
       "ticket":{
           "ticketId": ticketid,
           "name": name,
           "seatNumber": seatnumber,
           "price":price
       },
       "payment":{
           "paymentId": paymentid,
           "status":status
       }
   }

   // jQuery Ajax Post Request
   $.ajax({
       headers: {
           'Accept': 'application/json',
           'Content-Type': 'application/json',
           'Access-Control-Allow-Origin': '*',
           "Access-Control-Allow-Credentials" : true
       },
       xhrFields: {withCredentials: true},
       'type': 'POST',
       'url': url,
       'CrossOrigin': true,
       'data': JSON.stringify(data),
       'dataType': 'json',
       'success': callback
   });
});
