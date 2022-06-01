
const getTickets = async() => {
    // let response = await fetch('http://localhost:8080/booking/1');
    let response2 = await fetch('http://localhost:8080/booking', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify (
            {
                ticket: {
                ticketId: 6,
                name: "ABC",
                seatNumber: 15,
                price:3000
                },
                payment:  {
                paymentId: 789,
                status:"Success"
                                }
                            }
                        )
                    });
                    // console.log(response);
                    console.log(response2);
                }

                // if (submit) {
                //     submit.addEventListener('click', getTickets);
                // }

                // console.log("hello");
                // alert("hello ppl");
