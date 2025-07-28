var cityName = service.Parameters.city;

var supportedCities = ['Tanta', 'Luxor', 'Cairo'];

if (!supportedCities.includes(cityName)) {
    service.error('Not supported city');
}

const query = `SELECT * FROM GROUP_67239 WHERE city = '${cityName}' order by TimeStamp desc LIMIT 1`;

function searchIn_callback(err, result) {
    if (err) {
        return service.error(err);
    }
    // write your code here
    
        service.end(JSON.stringify(result));

}

SearchIn(query, searchIn_callback);
