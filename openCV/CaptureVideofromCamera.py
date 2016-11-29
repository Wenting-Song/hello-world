import numpy as np
import cv2

cap = cv2.VideoCapture(0)
"""Capture frame-by-frame;"Frame" will get the next frame in the camera (via "cap"). 
    "Ret" will obtain return value from getting the camera frame, either true of false"""

while(True):

    ret, frame = cap.read()

    # Our operations on the frame come here
    gray = frame
    #if you want gray video, try this: gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    

    # Display the resulting frame
    cv2.imshow('frame',gray)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

# When everything done, release the capture
cap.release()
cv2.destroyAllWindows()