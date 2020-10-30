async function register() {
    console.log("FDNWFJW");
    let registerObj = {
        login: document.getElementsByClassName("userName-input")[0].value,
        password: document.getElementsByClassName("passwordReg-input")[0].value
    }
    // if(registerObj.login == "" || registerObj.password == "") {
    //     alert("Input all fields");
    // }
    //
    // const register = await fetch("http://localhost:8080/register", {
    //     method: 'POST',
    //     body: JSON.stringify(registerObj),
    //     headers: {
    //         'Content-Type': 'application/json'
    //     }
    // });
    // const json = await register.text();
    // if(json === "OK") {
    //     console.log("WLKJEHGWJ");
    //     location.assign('http://localhost:8080/auth');
    // }
    // else {
    //     alert("This login already exists");
    // }
}
