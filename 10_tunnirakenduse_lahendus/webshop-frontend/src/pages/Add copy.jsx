function Add(){
    function addProduct(){

        //const nameRef = useRef();
        //input ret = {nameRef}
        //JSON .stringify({name: nameRef.current.value})



        fetch("http://localhost:8080/products",{
            method: "POST",
            body: JSON.stringify({name: "Coca cola", price: 3}),
            headers: {
                "Content-Type" : "application/json"
            }
        });
    }
    return (<div>
        <button onClick={()=> addProduct()}>Lisa</button>
    </div>)
}

export default Add;