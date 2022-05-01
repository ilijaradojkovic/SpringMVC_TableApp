
$( document ).ready(function() {
    $.fn.serializeObject = function () {
        var o = {};
        var a = this.serializeArray();
        $.each(a, function () {
            if (o[this.name]) {
                if (!o[this.name].push) {
                    o[this.name] = [o[this.name]];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
    };

    $("#InsertStudentForm").submit(function (e){
        e.preventDefault();

        let formData=$("#InsertStudentForm").serializeObject();
        console.log(formData);
        $.ajax({
            url: window.location,
            type: "POST",

            contentType: "application/json",
            dataType: 'json',
            data:JSON.stringify(formData),
            success: function (res) {
                console.log(res);

            }
        });
    });
});
