var ParkingName = service.Parameters.ParkingName;

var parkingName = ['ALex','cairo','Mansoura'];

if (!parkingName.includes(ParkingName)) {
    service.error('Parking Name Not Found');
}

const query = `SELECT * FROM APPLICATION_8296 WHERE ParkingName = '${ParkingName}'`;

function searchIn_callback(err, result) {
    if (err) {
        return service.error(err);
    }
    // write your code here
    
        service.end(JSON.stringify(result));

}

SearchIn(query, searchIn_callback);


  
