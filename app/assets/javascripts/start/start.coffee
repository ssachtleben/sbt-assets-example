(->
  $ ->
    console.log 'Application started'
    $('body').append '<div>' + require('test1').show() + '</div>'
    $('body').append '<div>' + require('test2').show() + '</div>'
    $('body').append Handlebars.template(require('test.tmpl'))()
    return
    
).call this