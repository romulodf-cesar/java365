//criar um algoritmo que guarde no navegador os dados

//ele vai receber via submit
const frm = document.querySelector("form")

frm.addEventListener("submit",(e)=>{
    guardarDados()
    e.preventDefault()
})

function guardarDados() {

    //criar um objeto com os dados do usuário
    const cafe = {
        tipo: document.getElementById("tipo").value,
        acidez: document.getElementById("acidez").value,
        aroma: document.getElementById("aroma").value
    }
    //guardar os dados no localStorage
    localStorage.setItem("cafe", JSON.stringify(cafe))
    alert("Dados guardados com sucesso!")
    
}