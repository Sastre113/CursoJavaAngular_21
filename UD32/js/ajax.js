
const opcion = $('.opciones')[0];
const mostrar = $('.queryAjax')[0];
const btnEnviar = $('#btnEnviar')[0];

opcion.addEventListener('click', (e) => {
    e.preventDefault();

    switch (e.target.id) {
        case 'getAll':
            getAll();
            break;
        case 'getByName':
            let check = `?fullText=${$("#campoCheck")[0].checked}`;
            let name = $("#campoTexto")[0].value;
            getByName(name, check);
            break;
        case 'getByCode':
            getByAlphaCode($("#campoTexto")[0].value);
            break;
        case 'getByCurrency':
            getByCurrency($("#campoTexto")[0].value);
            break;

        case 'getByLanguage':
            getByLanguage($("#campoTexto")[0].value);
            break;
        case 'getByCapital':
            getByCapital($("#campoTexto")[0].value);
            break;
        case 'getByCallingCode':
            getByCallingCode($("#campoTexto")[0].value);
            break;
        case 'getByRegion':
            getByRegion($("#campoTexto")[0].value);
            break;
        case 'getByRegionBloc':
            getByRegionBloc($("#campoTexto")[0].value);
            break;
        case 'getByFields':
            getByFields($("#campoTexto")[0].value);
            break;
    }

});

const error = () => {
    $('#queryAjax').html("Error 404.\nPosible Causa: Debe introducir algún valor en el campo");
}

const getAll = () => {
    $.ajax({
        url: "https://restcountries.eu/rest/v2/all",
        method: "GET",
        dataType: "json",
        contentType: "application/x-www-form-urlencoded",

        success: function (data) {
            console.log(data);
            $('#queryAjax').html(JSON.stringify(data));
        },
        error: error()
    });
}

const getByName = (name, fullText) => {
    $.ajax({
        url: `https://restcountries.eu/rest/v2/name/${name}${fullText}`,
        method: "GET",
        dataType: "json",
        contentType: "application/x-www-form-urlencoded",

        success: function (data) {
            console.log(data);
            $('#queryAjax').html(JSON.stringify(data));
        },
        error: error()
    });
}

const getByAlphaCode = (code) => {
    $.ajax({
        url: `https://restcountries.eu/rest/v2/alpha?codes=${code}`,
        method: "GET",
        dataType: "json",
        contentType: "application/x-www-form-urlencoded",

        success: function (data) {
            console.log(data);
            $('#queryAjax').html(JSON.stringify(data));
        },
        error: error()
    });
}

const getByCurrency = (currency) => {
    $.ajax({
        url: `https://restcountries.eu/rest/v2/currency/${currency}`,
        method: "GET",
        dataType: "json",
        contentType: "application/x-www-form-urlencoded",

        success: function (data) {
            console.log(data);
            $('#queryAjax').html(JSON.stringify(data));
        },
        error: error()
    });
}


const getByLanguage = (et) => {
    $.ajax({
        url: `https://restcountries.eu/rest/v2/lang/${et}`,
        method: "GET",
        dataType: "json",
        contentType: "application/x-www-form-urlencoded",

        success: function (data) {
            console.log(data);
            $('#queryAjax').html(JSON.stringify(data));
        },
        error: error()
    });
}

const getByCapital = (capital) => {
    $.ajax({
        url: `https://restcountries.eu/rest/v2/capital/${capital}`,
        method: "GET",
        dataType: "json",
        contentType: "application/x-www-form-urlencoded",

        success: function (data) {
            console.log(data);
            $('#queryAjax').html(JSON.stringify(data));
        },
        error: error()
    });
}

const getByCallingCode = (callingcode) => {
    $.ajax({
        url: `https://restcountries.eu/rest/v2/callingcode/${callingcode}`,
        method: "GET",
        dataType: "json",
        contentType: "application/x-www-form-urlencoded",

        success: function (data) {
            console.log(data);
            $('#queryAjax').html(JSON.stringify(data));
        },
        error: error()
    });
}

const getByRegion = (region) => {
    $.ajax({
        url: `https://restcountries.eu/rest/v2/region/${region}`,
        method: "GET",
        dataType: "json",
        contentType: "application/x-www-form-urlencoded",

        success: function (data) {
            console.log(data);
            $('#queryAjax').html(JSON.stringify(data));
        },
        error: error()
    });
}

const getByRegionBloc = (regionalbloc) => {
    $.ajax({
        url: `https://restcountries.eu/rest/v2/regionalbloc/${regionalbloc}`,
        method: "GET",
        dataType: "json",
        contentType: "application/x-www-form-urlencoded",

        success: function (data) {
            console.log(data);
            $('#queryAjax').html(JSON.stringify(data));
        },
        error: error()
    });
}

const getByFields = (fields) => {
    $.ajax({
        url: `https://restcountries.eu/rest/v2/all?fields=${fields}`,
        method: "GET",
        dataType: "json",
        contentType: "application/x-www-form-urlencoded",

        success: function (data) {
            console.log(data);
            $('#queryAjax').html(JSON.stringify(data));
        },
        error: error()
    });
}