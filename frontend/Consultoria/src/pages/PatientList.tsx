// src/pages/PatientList.tsx

import { IonButton, IonContent, IonHeader, IonItem, IonLabel, IonList, IonPage, IonTitle, IonToolbar } from '@ionic/react';
import React, { useState, useEffect } from 'react';
import { useHistory } from 'react-router';

const PatientList: React.FC = () => {
  const [patients, setPatients] = useState<any[]>([]);
  const history = useHistory();

  useEffect(() => {
    // Cargar pacientes aquí si lo necesitas
  }, []);

  const navigateToAddPatient = () => {
    history.push('/add-patient');
  };

  return (
    <IonPage>
      <IonHeader>
        <IonToolbar>
          <IonTitle>Lista de Pacientes</IonTitle>
        </IonToolbar>
      </IonHeader>
      <IonContent>
        <IonList>
          {patients.map((patient, index) => (
            <IonItem key={index}>
              <IonLabel>{patient.name}</IonLabel>
              <IonLabel>{patient.dob}</IonLabel>
              <IonLabel>{patient.doctor.name}</IonLabel>
              <IonLabel>{patient.doctor.specialty}</IonLabel>
            </IonItem>
          ))}
        </IonList>
        <IonButton onClick={navigateToAddPatient}>Agregar Paciente</IonButton>
      </IonContent>
    </IonPage>
  );
};

export default PatientList;
