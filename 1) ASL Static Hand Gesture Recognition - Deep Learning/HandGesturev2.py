print("================================")

import tensorflow as tf 
print(f"tensorflow : {tf.__version__}")
import numpy as np
print(f"numpy : {np.__version__}")
import cv2
print(f"cv2 : {cv2.__version__}")
import time

cam = cv2.VideoCapture(0)
print(f"Web Camera Initialized")
model = tf.keras.models.load_model('asl_colab_model')
print(f"Model Loaded")
keys = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'space', 'del', 'nothing']
print(f"Keys Loaded")

print("================================")

old_predicted_value = ""

while(True):

    # get frame from the camera
    check , frame = cam.read()
    frame = cv2.flip(frame , 1) # flip vertically to get correct output
 
    scan = cv2.resize(frame[200:400,100:300], (64,64))

    images = []
    images.append(scan)
    images = np.array(images)
    images = images.astype('float32')/255
    predicted_answer = keys[int(model.predict_classes(images))]

    if old_predicted_value != 'nothing' and predicted_answer == 'nothing':
        
        print(f"predicted value : {old_predicted_value}")

    cv2.rectangle(frame, (100, 100), (300, 300), (0,255,0), 5)

    cv2.putText(frame,'Prediction : '+str(predicted_answer),(75,50),cv2.FONT_HERSHEY_COMPLEX,1,(0,255,0),1)

    cv2.imshow('frame' , frame)
    
    if predicted_answer != "nothing":
        old_predicted_value = predicted_answer

    time.sleep(0.1)
    
    key = cv2.waitKey(33)
    if key == 27:
        break

print(f"Cam Dimenstion : {frame.shape}")
print("================================")
cam.release()
cv2.destroyAllWindows()
print(f"Web Camera Suspended")
print("================================")