var name = service.Parameters.ParkingName;
var nFess = service.Parameters.NewFees;

const opt = {
    "AppId": "8296",
    "AppKey": "OTGZCLITPITcGF4Z1753254356747Parking Area",
    "ConditionList": [{
        "reading": "ParkingName",
        "value": name,
        "condition": "=" // like, =, !=, >, >= ,<, <=, in, not in
    }],
    "UpdateList": {
        "Fees": nFess
    }
};

function updateApplicationData_callback(err, result) {
    if (err) {
        return service.error(err);
    }

    service.end(result);
}

UpdateApplicationData(opt, updateApplicationData_callback);
