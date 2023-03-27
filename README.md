# Timelyx
[http://timelyx.tech/](http://timelyx.tech/)

# Inspiration
Time is the most precious entity for a student. Time spent on a productive activity that could've been wasted, results in better outcomes. We've engineered a solution that eases the problems that we ourselves have faced as students.

# What it does
Timelyx is a Progressive Wep-App (PWA) that uses data trained on Machine Learning datasets to aid students in a real-time manner.
  
The solution shows different locations that a student can go to between classes and what activity they can do based on their academic calendars. Real-time data that is sourced from infrared sensors forms the crux of our application, because that is the fuel that is fed to our AI model. The AI algorithm maps the number of entries and exits in a room to determine the number of occupants in the room. Using this data and based on what the student has as a deliverable in the upcoming day, week or month, we show the best resource available and where they can go to be most productive. 

The user interface (UI) allows the student to see what courses they're registered in, pending tasks in a calendar and list view, where they can go between classes, along with note taking features.

# How we built it
The hardware of the project was made using Arduino Nano 33 IoT microcontroller that was interfaced with two infrared sensors. We used Java with Spring Boot for the backend and MongoDB for storing data. The front-end was made using HTML, CSS and JavaScript. The application was containerized into a docker.

# Challenges we ran into
Sending geographic data from the on-board modem in the microcontroller was a challenge because of absence of MongoDB libraries in c for Arduino. Building a single calendar view to display: courses, notes, recommendations by teachers and space availability was challenging. Also, implementing the recommended AI model suggested by the Google Cloud Platform (GCP) was challenging because of poor documentation resources.

# Accomplishments that we're proud of
A robust communication between backend and front-end, and interfacing hardware components to the microcontroller are some of the most time consuming activities. We spent considerable amount of time ensuring that everything works smoothly that results in an enhanced user experience. Being engineers and TAs and RAs in our respective fields; we could leverage our experience and perspective in building something that could help build someone's future.

# What we learned
That data is the next oil. The possibilities that can be generated from enhancing the power of data are limitless. The coherence of IoT in academia in this manner is something that we didn't imagine could be done before.

# What's next for Timelyx
Using AES-128 bit encryption and decryption libraries to send and receive encrypted information between hardware and the cloud. Horizontal scaling by building fully functional CI/CD pipeline for automated deployment through Kubernetes, to a larger audience of users, educational and corporate institutions. 
