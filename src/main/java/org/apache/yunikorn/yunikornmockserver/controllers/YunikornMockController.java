package org.apache.yunikorn.yunikornmockserver.controllers;

import org.apache.yunikorn.yunikornmockserver.models.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/ws/v1")
public class YunikornMockController {

  @GetMapping("/apps")
  public ResponseEntity<ErrorResponse> findApps() {
    return new ResponseEntity<>(new ErrorResponse(
        HttpStatus.INTERNAL_SERVER_ERROR.value(),
        "Failed to get apps.",
        "Internal Server Error: Failed to get applications."
    ), HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @GetMapping("/queues")
  public ResponseEntity<ErrorResponse> findQueues() {
    return new ResponseEntity<>(new ErrorResponse(
        HttpStatus.INTERNAL_SERVER_ERROR.value(),
        "Failed to get queues.",
        "Internal Server Error: Failed to get queues."
    ), HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @GetMapping("/nodes")
  public ResponseEntity<ErrorResponse> findNodes() {
    return new ResponseEntity<>(new ErrorResponse(
        HttpStatus.INTERNAL_SERVER_ERROR.value(),
        "Failed to get nodes.",
        "Internal Server Error: Failed to get nodes."
    ), HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @GetMapping("/clusters")
  public ResponseEntity<ErrorResponse> findClusters() {
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
        new ErrorResponse(
            HttpStatus.INTERNAL_SERVER_ERROR.value(),
            "Failed to get cluster details.",
            "Internal Server Error: Failed to get cluster details."
        )
    );
  }

  @GetMapping("/history/apps")
  public ResponseEntity<ErrorResponse> findAppsHistory() {
    return ResponseEntity.internalServerError().body(
        new ErrorResponse(
            HttpStatus.INTERNAL_SERVER_ERROR.value(),
            "Failed to get apps history.",
            "Internal Server Error: Failed to get apps history."
        )
    );
  }

  @GetMapping("/history/containers")
  public ResponseEntity<ErrorResponse> findContainersHistory() {
    return ResponseEntity.internalServerError().body(
        new ErrorResponse(
            HttpStatus.INTERNAL_SERVER_ERROR.value(),
            "Failed to get containers history.",
            "Internal Server Error: Failed to get containers history."
        )
    );
  }
}
