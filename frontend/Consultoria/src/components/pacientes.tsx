// src/pages/AddPatient.tsx

import { IonButton, IonContent, IonDatetime, IonHeader, IonInput, IonPage, IonTitle, IonToolbar } from '@ionic/react';
import React, { useState } from 'react';
import { useHistory } from 'react-router';

const AddPatient: React.FC = () => {
  const [patientName, setPatientName] = useState<string>('');
  const [patientDOB, setPatientDOB] = useState<string>('');
  const [doctorName, setDoctorName] = useState<string>('');
  const [doctorSpecialty, setDoctorSpecialty] = useState<string>('');

  const history = useHistory();

  const addPatient = () => {
    // Aquí puedes agregar la lógica para guardar el paciente
    // Por ejemplo, puedes enviar los datos a un servidor o guardarlos localmente

    // Puedes agregar más lógica aquí, como navegar a otra página o limpiar los campos
    history.push('/patient-list');
  };

  return (
    <IonPage>
      <IonHeader>
        <IonToolbar>
          <IonTitle>Agregar Paciente</IonTitle>
        </IonToolbar>
      </IonHeader>
      <IonContent>
        <IonInput placeholder="Nombre del paciente" value={patientName} onIonChange={e => setPatientName(e.detail.value!)}></IonInput>
        <IonInput placeholder="Nombre del médico" value={doctorName} onIonChange={e => setDoctorName(e.detail.value!)}></IonInput>
        <IonInput placeholder="Especialidad del médico" value={doctorSpecialty} onIonChange={e => setDoctorSpecialty(e.detail.value!)}></IonInput>
        <IonButton onClick={addPatient}>Agregar</IonButton>
      </IonContent>
    </IonPage>
  );
};

export default AddPatient;
