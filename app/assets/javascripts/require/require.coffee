modules={}
loaded={}
isLegacyIE = navigator.userAgent.indexOf('MSIE 7.0') isnt -1 || navigator.userAgent.indexOf('MSIE 8.0') isnt -1

define = (name, callback) ->
    modules[name] = callback
@define=define

require = (name, forceInit = false) ->
    if _.isArray name
        require element for element in name
    else
        throw 'The module "' + name + '" could not be found' unless modules[name]
        return loadModule name, forceInit
@require=require

loadModule = (name, forceInit = false) ->
    unless (loaded[name]? and !forceInit)
        loaded[name] = if typeof modules[name] is 'string' then globalEval modules[name] else modules[name].call @
    return loaded[name]
    
globalEval = (data) ->
    if data
        data = (if isLegacyIE then "(function() {return #{data};})()" else "(#{data})") if data.indexOf 'function' is 0
        content = eval.call @, data
    if typeof content is 'function' then content() else true