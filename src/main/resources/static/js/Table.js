$( document ).ready(function() {

    if(window.location.pathname==="/") {
        $.ajax({
            url: "/GetAllStudents",
            type: "GET",


            success: function (res) {
              let htmlResponse='';
              for(let element of res){
                  htmlResponse+='   <tr>\n' +
                      '            <th scope="row">'+element['id']+'</th>\n' +
                      '            <td>'+element['firstName']+'</td>\n' +
                      '            <td>'+element['lastName']+'</td>\n' +
                      '            <td>'+element['age']+'</td>\n' +
                      '            <td class="d-flex">\n' +
                      '                <button class="btn">\n' +
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
                    htmlResponse+='   <tr>\n' +
                        '            <th scope="row">'+element['id']+'</th>\n' +
                        '            <td>'+element['firstName']+'</td>\n' +
                        '            <td>'+element['lastName']+'</td>\n' +
                        '            <td>'+element['age']+'</td>\n' +
                        '            <td class="d-flex">\n' +
                        '                <button class="btn">\n' +
                        '                <i class="fa-solid fa-trash" style="color:white"></i>\n' +
                        '            </button>\n' +
                        '            <button class="btn">\n' +
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
