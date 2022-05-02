
function DeleteProfesorClicked(id){
    $.ajax({

       url:"/DeleteProfesor/"+id,
       type:"DELETE",

        success: function (res) {

            $('#'+res).remove();

       }
    });
}


function DeleteStudentClicked(id){
    $.ajax({

        url:"/DeleteStudent/"+id,
        type:"DELETE",

        success: function (res) {

 $('#'+res).remove();



        }
    });
}

function  UpdateClicked(id){
    console.log("cais"+id);
}
$( document ).ready(function() {


    if(window.location.pathname==="/") {
        $.ajax({
            url: "/GetAllStudents",
            type: "GET",


            success: function (res) {
              let htmlResponse='';
              for(let element of res){
                  htmlResponse+='   <tr id='+element['id'] + '>\n' +
                      '            <th scope="row">'+element['id']+'</th>\n' +
                      '            <td>'+element['firstName']+'</td>\n' +
                      '            <td>'+element['lastName']+'</td>\n' +
                      '            <td>'+element['age']+'</td>\n' +
                      '            <td class="d-flex">\n' +
                      '                <button class="btn" onclick="DeleteStudentClicked(\'' +element['id'] + '\')">\n' +
                      '                <i class="fa-solid fa-trash" style="color:white"></i>\n' +
                      '            </button>\n' +
                      '            <button class="btn">\n' +
                      '                <i class="fa-solid fa-pencil" style="color:white"></i>\n' +
                      '            </button>\n' +
                      '            </td>\n' +
                      '\n' +
                      '        </tr>'

                  $('#bodyStudentTable').html(htmlResponse);
                }

            }
        });
        $.ajax({
            url: "/GetAllProfesors",
            type: "GET",


            success: function (res) {
                let htmlResponse='';
                for(let element of res){
                    htmlResponse+='   <tr id='+element['id'] + '>\n' +
                        '            <th scope="row">'+element['id']+'</th>\n' +
                        '            <td>'+element['firstName']+'</td>\n' +
                        '            <td>'+element['lastName']+'</td>\n' +
                        '            <td>'+element['age']+'</td>\n' +
                        '            <td class="d-flex">\n' +
                        '                <button class="btn" onclick="DeleteProfesorClicked(\'' +element['id'] + '\')">\n' +
                        '                <i class="fa-solid fa-trash" style="color:white"></i>\n' +
                        '            </button>\n' +
                        '            <button class="btn"  onclick="UpdateClicked(\'' +element['id'] + '\')">\n' +
                        '                <i class="fa-solid fa-pencil" style="color:white"></i>\n' +
                        '            </button>\n' +
                        '            </td>\n' +
                        '\n' +
                        '        </tr>'

                    $('#bodyProfesorTable').html(htmlResponse);
                }

            }
        });
    }
});
