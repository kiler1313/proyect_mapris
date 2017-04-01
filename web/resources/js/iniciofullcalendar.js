/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {

    // page is now ready, initialize the calendar...

    $('#calendar').fullCalendar({
        // put your options and callbacks here
    })

});

$(document).ready(function() {
            

    var date = new Date(),
             d = date.getDate(),
            m = date.getMonth(),
            y = date.getFullYear(),
            started,
            categoryClass;

     var calendar = $('#calendar').fullCalendar({
          header: {
            left: 'prev,next today',
            center: 'title',
            right: 'month,agendaWeek,agendaDay'
          },
          selectable: true,
         height: 500,
          selectHelper: true,
          select: function(start, end, allDay) {
            $('#fc_create').click();

            started = start;
            ended = end;

            $(".antosubmit").on("click", function() {
              var title = $("#title").val();
              if (end) {
                ended = end;
              }

              categoryClass = $("#event_type").val();

              if (title) {
                calendar.fullCalendar('renderEvent', {
                    title: title,
                    start: started,
                    end: end,
                    allDay: allDay
                  },
                  true // make the event "stick"
                );
              }

              $('#title').val('');

              calendar.fullCalendar('unselect');

              $('.antoclose').click();

              return false;
            });
          },
          eventClick: function(calEvent, jsEvent, view) {
            $('#fc_edit').click();
            $('#title2').val(calEvent.title);

            categoryClass = $("#event_type").val();

            $(".antosubmit2").on("click", function() {
              calEvent.title = $("#title2").val();

              calendar.fullCalendar('updateEvent', calEvent);
              $('.antoclose2').click();
            });

            calendar.fullCalendar('unselect');
          },
          editable: true,
          events: [{
            title: 'Programa prenatal',
            start: new Date(y, m, 1),
            end: new Date(y, m, 4)
          }, {
            title: 'Semana posparto',
            start: new Date(y, m,  12),
            end: new Date(y, m,  18)
          }, {
            title: 'Semana prenatal',
            start: new Date(y, m, 5),
            end: new Date(y, m, 11)
            }, {
            title: 'Semana Club bebé',
            start: new Date(y, m, 19),
            end: new Date(y, m, 25),
            allDay: false
          }, {
            title: 'Semana Spa',
            start: new Date(y, m, 26),
            end: new Date(y, m, 31),
            allDay: false
          }]
        });
      });
     
   
/*editable: true,
weekMode: 'liquid',
url:'#',

aspectRatio: 3,
theme: true,
header: {
left: 'prev,next today',
center: 'title',
right: 'month,agendaWeek,agendaDay'
},
editable: true,
disableDragging: true,
firstDay: 1,
weekends: true,
defaultEventMinutes:30,
monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio','Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
monthNameShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun','Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
dayNames: ['Domingo', 'Lunes', 'Martes', 'Miercoles','Jueves', 'Viernes', 'Sabado'],
dayNamesShort: ['Dom', 'Lun', 'Mar', 'Mie', 'Jue', 'Vie', 'Sab'],
buttonText: {
today: 'hoy',
month: 'mes',
week: 'semana',
day: 'dia'},
allDaySlot: false,
allDayText: 'Todo el dia',
axisFormat: 'H:mm',
events: "json-events.php",
timeFormat: 'H:mm{ - H:mm}',
        listYear:'lista',
listMonth:'lista',
listWeek:'lista',
listDay:'list',

navLinks:'true',*/
        
        /*Eventps*/
   


