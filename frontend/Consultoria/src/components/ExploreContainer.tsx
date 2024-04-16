// ExploreContainer.tsx

import React from 'react';
import './ExploreContainer.css';
import { IonInput, IonItem, IonButton, IonCard, IonCardHeader, IonCardTitle, IonCardContent } from '@ionic/react';

interface ContainerProps {}

const ExploreContainer: React.FC<ContainerProps> = () => {
  return (
    <div id="container">
      <IonCard>
        <IonCardHeader>
          <IonCardTitle >Inicio de Sesión</IonCardTitle>
        </IonCardHeader>

        <IonCardContent>
          <IonItem>
            <IonInput placeholder="Nombre de usuario" maxlength={20} />
          </IonItem>

          <IonItem>
            <IonInput type="password" placeholder="Contraseña" maxlength={20} />
          </IonItem>
        </IonCardContent>

        <IonButton expand="full">Ingresar</IonButton>
      </IonCard>
    </div>
  );
};

export default ExploreContainer;

