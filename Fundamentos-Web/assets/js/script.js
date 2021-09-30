let nome=document.getElementById('nome')
let email=document.querySelector('#email')

function validaNome(){
    let txtNome=document.querySelector("#txtNome")

    if(nome.value.length < 3){
        txtNome.innerHTML="Nome inválido"
        txtNome.style.color='red'
    }else{
        txtNome.innerHTML=" "
  
    }
}
function validaEmail(){
    let txtEmail=document.querySelector('#txtEmail')

    if(email.value.indexOf("@")== -1 || email.value.indexOf(".")==-1){
        txtEmail.innerHTML="Email inválido"
        txtEmail.style.color='red'
    }else{
        txtEmail.innerHTML=" "
      
    }
}


        
 