﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Ce code a été généré par un outil.
//     Version du runtime :4.0.30319.42000
//
//     Les modifications apportées à ce fichier peuvent provoquer un comportement incorrect et seront perdues si
//     le code est régénéré.
// </auto-generated>
//------------------------------------------------------------------------------

namespace CS_Server_Main.JCDecaux_API {
    using System.Runtime.Serialization;
    using System;
    
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Runtime.Serialization", "4.0.0.0")]
    [System.Runtime.Serialization.DataContractAttribute(Name="JCContrat", Namespace="http://schemas.datacontract.org/2004/07/CS_Server_Main")]
    [System.SerializableAttribute()]
    public partial class JCContrat : object, System.Runtime.Serialization.IExtensibleDataObject, System.ComponentModel.INotifyPropertyChanged {
        
        [System.NonSerializedAttribute()]
        private System.Runtime.Serialization.ExtensionDataObject extensionDataField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string[] citiesField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string commercial_nameField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string country_codeField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string nameField;
        
        [global::System.ComponentModel.BrowsableAttribute(false)]
        public System.Runtime.Serialization.ExtensionDataObject ExtensionData {
            get {
                return this.extensionDataField;
            }
            set {
                this.extensionDataField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string[] cities {
            get {
                return this.citiesField;
            }
            set {
                if ((object.ReferenceEquals(this.citiesField, value) != true)) {
                    this.citiesField = value;
                    this.RaisePropertyChanged("cities");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string commercial_name {
            get {
                return this.commercial_nameField;
            }
            set {
                if ((object.ReferenceEquals(this.commercial_nameField, value) != true)) {
                    this.commercial_nameField = value;
                    this.RaisePropertyChanged("commercial_name");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string country_code {
            get {
                return this.country_codeField;
            }
            set {
                if ((object.ReferenceEquals(this.country_codeField, value) != true)) {
                    this.country_codeField = value;
                    this.RaisePropertyChanged("country_code");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string name {
            get {
                return this.nameField;
            }
            set {
                if ((object.ReferenceEquals(this.nameField, value) != true)) {
                    this.nameField = value;
                    this.RaisePropertyChanged("name");
                }
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Runtime.Serialization", "4.0.0.0")]
    [System.Runtime.Serialization.DataContractAttribute(Name="JCStation", Namespace="http://schemas.datacontract.org/2004/07/CS_Server_Main")]
    [System.SerializableAttribute()]
    [System.Runtime.Serialization.KnownTypeAttribute(typeof(System.Device.Location.GeoCoordinate))]
    [System.Runtime.Serialization.KnownTypeAttribute(typeof(string[]))]
    [System.Runtime.Serialization.KnownTypeAttribute(typeof(CS_Server_Main.JCDecaux_API.Position))]
    [System.Runtime.Serialization.KnownTypeAttribute(typeof(CS_Server_Main.JCDecaux_API.JCContrat))]
    [System.Runtime.Serialization.KnownTypeAttribute(typeof(CS_Server_Main.JCDecaux_API.JCStands))]
    public partial class JCStation : object, System.Runtime.Serialization.IExtensibleDataObject, System.ComponentModel.INotifyPropertyChanged {
        
        [System.NonSerializedAttribute()]
        private System.Runtime.Serialization.ExtensionDataObject extensionDataField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string adressField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private bool bankingField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private bool bonusField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private bool connectedField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string contractNameField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string lastUpdateField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private CS_Server_Main.JCDecaux_API.JCStands mainStandsField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string nameField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private int numberField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private bool overflowField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private object overflowStandsField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private CS_Server_Main.JCDecaux_API.Position positionField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string shapeField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private string statusField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private CS_Server_Main.JCDecaux_API.JCStands totalStandsField;
        
        [global::System.ComponentModel.BrowsableAttribute(false)]
        public System.Runtime.Serialization.ExtensionDataObject ExtensionData {
            get {
                return this.extensionDataField;
            }
            set {
                this.extensionDataField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string adress {
            get {
                return this.adressField;
            }
            set {
                if ((object.ReferenceEquals(this.adressField, value) != true)) {
                    this.adressField = value;
                    this.RaisePropertyChanged("adress");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public bool banking {
            get {
                return this.bankingField;
            }
            set {
                if ((this.bankingField.Equals(value) != true)) {
                    this.bankingField = value;
                    this.RaisePropertyChanged("banking");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public bool bonus {
            get {
                return this.bonusField;
            }
            set {
                if ((this.bonusField.Equals(value) != true)) {
                    this.bonusField = value;
                    this.RaisePropertyChanged("bonus");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public bool connected {
            get {
                return this.connectedField;
            }
            set {
                if ((this.connectedField.Equals(value) != true)) {
                    this.connectedField = value;
                    this.RaisePropertyChanged("connected");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string contractName {
            get {
                return this.contractNameField;
            }
            set {
                if ((object.ReferenceEquals(this.contractNameField, value) != true)) {
                    this.contractNameField = value;
                    this.RaisePropertyChanged("contractName");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string lastUpdate {
            get {
                return this.lastUpdateField;
            }
            set {
                if ((object.ReferenceEquals(this.lastUpdateField, value) != true)) {
                    this.lastUpdateField = value;
                    this.RaisePropertyChanged("lastUpdate");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public CS_Server_Main.JCDecaux_API.JCStands mainStands {
            get {
                return this.mainStandsField;
            }
            set {
                if ((object.ReferenceEquals(this.mainStandsField, value) != true)) {
                    this.mainStandsField = value;
                    this.RaisePropertyChanged("mainStands");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string name {
            get {
                return this.nameField;
            }
            set {
                if ((object.ReferenceEquals(this.nameField, value) != true)) {
                    this.nameField = value;
                    this.RaisePropertyChanged("name");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public int number {
            get {
                return this.numberField;
            }
            set {
                if ((this.numberField.Equals(value) != true)) {
                    this.numberField = value;
                    this.RaisePropertyChanged("number");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public bool overflow {
            get {
                return this.overflowField;
            }
            set {
                if ((this.overflowField.Equals(value) != true)) {
                    this.overflowField = value;
                    this.RaisePropertyChanged("overflow");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public object overflowStands {
            get {
                return this.overflowStandsField;
            }
            set {
                if ((object.ReferenceEquals(this.overflowStandsField, value) != true)) {
                    this.overflowStandsField = value;
                    this.RaisePropertyChanged("overflowStands");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public CS_Server_Main.JCDecaux_API.Position position {
            get {
                return this.positionField;
            }
            set {
                if ((object.ReferenceEquals(this.positionField, value) != true)) {
                    this.positionField = value;
                    this.RaisePropertyChanged("position");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string shape {
            get {
                return this.shapeField;
            }
            set {
                if ((object.ReferenceEquals(this.shapeField, value) != true)) {
                    this.shapeField = value;
                    this.RaisePropertyChanged("shape");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public string status {
            get {
                return this.statusField;
            }
            set {
                if ((object.ReferenceEquals(this.statusField, value) != true)) {
                    this.statusField = value;
                    this.RaisePropertyChanged("status");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public CS_Server_Main.JCDecaux_API.JCStands totalStands {
            get {
                return this.totalStandsField;
            }
            set {
                if ((object.ReferenceEquals(this.totalStandsField, value) != true)) {
                    this.totalStandsField = value;
                    this.RaisePropertyChanged("totalStands");
                }
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Runtime.Serialization", "4.0.0.0")]
    [System.Runtime.Serialization.DataContractAttribute(Name="JCStands", Namespace="http://schemas.datacontract.org/2004/07/CS_Server_Main")]
    [System.SerializableAttribute()]
    public partial class JCStands : object, System.Runtime.Serialization.IExtensibleDataObject, System.ComponentModel.INotifyPropertyChanged {
        
        [System.NonSerializedAttribute()]
        private System.Runtime.Serialization.ExtensionDataObject extensionDataField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private int capacityField;
        
        [global::System.ComponentModel.BrowsableAttribute(false)]
        public System.Runtime.Serialization.ExtensionDataObject ExtensionData {
            get {
                return this.extensionDataField;
            }
            set {
                this.extensionDataField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public int capacity {
            get {
                return this.capacityField;
            }
            set {
                if ((this.capacityField.Equals(value) != true)) {
                    this.capacityField = value;
                    this.RaisePropertyChanged("capacity");
                }
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Runtime.Serialization", "4.0.0.0")]
    [System.Runtime.Serialization.DataContractAttribute(Name="Position", Namespace="http://schemas.datacontract.org/2004/07/CS_Server_Main.Utils")]
    [System.SerializableAttribute()]
    public partial class Position : object, System.Runtime.Serialization.IExtensibleDataObject, System.ComponentModel.INotifyPropertyChanged {
        
        [System.NonSerializedAttribute()]
        private System.Runtime.Serialization.ExtensionDataObject extensionDataField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private double latitudeField;
        
        [System.Runtime.Serialization.OptionalFieldAttribute()]
        private double longitudeField;
        
        [global::System.ComponentModel.BrowsableAttribute(false)]
        public System.Runtime.Serialization.ExtensionDataObject ExtensionData {
            get {
                return this.extensionDataField;
            }
            set {
                this.extensionDataField = value;
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public double latitude {
            get {
                return this.latitudeField;
            }
            set {
                if ((this.latitudeField.Equals(value) != true)) {
                    this.latitudeField = value;
                    this.RaisePropertyChanged("latitude");
                }
            }
        }
        
        [System.Runtime.Serialization.DataMemberAttribute()]
        public double longitude {
            get {
                return this.longitudeField;
            }
            set {
                if ((this.longitudeField.Equals(value) != true)) {
                    this.longitudeField = value;
                    this.RaisePropertyChanged("longitude");
                }
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="JCDecaux_API.I_JCDecaux")]
    public interface I_JCDecaux {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/I_JCDecaux/getContractByCityName", ReplyAction="http://tempuri.org/I_JCDecaux/getContractByCityNameResponse")]
        CS_Server_Main.JCDecaux_API.JCContrat getContractByCityName(string cityName);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/I_JCDecaux/getContractByCityName", ReplyAction="http://tempuri.org/I_JCDecaux/getContractByCityNameResponse")]
        System.Threading.Tasks.Task<CS_Server_Main.JCDecaux_API.JCContrat> getContractByCityNameAsync(string cityName);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/I_JCDecaux/getNearestStationFromPosition", ReplyAction="http://tempuri.org/I_JCDecaux/getNearestStationFromPositionResponse")]
        CS_Server_Main.JCDecaux_API.JCStation getNearestStationFromPosition(System.Device.Location.GeoCoordinate coordinates, CS_Server_Main.JCDecaux_API.JCContrat contrat);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/I_JCDecaux/getNearestStationFromPosition", ReplyAction="http://tempuri.org/I_JCDecaux/getNearestStationFromPositionResponse")]
        System.Threading.Tasks.Task<CS_Server_Main.JCDecaux_API.JCStation> getNearestStationFromPositionAsync(System.Device.Location.GeoCoordinate coordinates, CS_Server_Main.JCDecaux_API.JCContrat contrat);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/I_JCDecaux/positionToGeoCoordinates", ReplyAction="http://tempuri.org/I_JCDecaux/positionToGeoCoordinatesResponse")]
        System.Device.Location.GeoCoordinate positionToGeoCoordinates(CS_Server_Main.JCDecaux_API.Position position);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/I_JCDecaux/positionToGeoCoordinates", ReplyAction="http://tempuri.org/I_JCDecaux/positionToGeoCoordinatesResponse")]
        System.Threading.Tasks.Task<System.Device.Location.GeoCoordinate> positionToGeoCoordinatesAsync(CS_Server_Main.JCDecaux_API.Position position);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/I_JCDecaux/testCom", ReplyAction="http://tempuri.org/I_JCDecaux/testComResponse")]
        void testCom();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/I_JCDecaux/testCom", ReplyAction="http://tempuri.org/I_JCDecaux/testComResponse")]
        System.Threading.Tasks.Task testComAsync();
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface I_JCDecauxChannel : CS_Server_Main.JCDecaux_API.I_JCDecaux, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class I_JCDecauxClient : System.ServiceModel.ClientBase<CS_Server_Main.JCDecaux_API.I_JCDecaux>, CS_Server_Main.JCDecaux_API.I_JCDecaux {
        
        public I_JCDecauxClient() {
        }
        
        public I_JCDecauxClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public I_JCDecauxClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public I_JCDecauxClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public I_JCDecauxClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        public CS_Server_Main.JCDecaux_API.JCContrat getContractByCityName(string cityName) {
            return base.Channel.getContractByCityName(cityName);
        }
        
        public System.Threading.Tasks.Task<CS_Server_Main.JCDecaux_API.JCContrat> getContractByCityNameAsync(string cityName) {
            return base.Channel.getContractByCityNameAsync(cityName);
        }
        
        public CS_Server_Main.JCDecaux_API.JCStation getNearestStationFromPosition(System.Device.Location.GeoCoordinate coordinates, CS_Server_Main.JCDecaux_API.JCContrat contrat) {
            return base.Channel.getNearestStationFromPosition(coordinates, contrat);
        }
        
        public System.Threading.Tasks.Task<CS_Server_Main.JCDecaux_API.JCStation> getNearestStationFromPositionAsync(System.Device.Location.GeoCoordinate coordinates, CS_Server_Main.JCDecaux_API.JCContrat contrat) {
            return base.Channel.getNearestStationFromPositionAsync(coordinates, contrat);
        }
        
        public System.Device.Location.GeoCoordinate positionToGeoCoordinates(CS_Server_Main.JCDecaux_API.Position position) {
            return base.Channel.positionToGeoCoordinates(position);
        }
        
        public System.Threading.Tasks.Task<System.Device.Location.GeoCoordinate> positionToGeoCoordinatesAsync(CS_Server_Main.JCDecaux_API.Position position) {
            return base.Channel.positionToGeoCoordinatesAsync(position);
        }
        
        public void testCom() {
            base.Channel.testCom();
        }
        
        public System.Threading.Tasks.Task testComAsync() {
            return base.Channel.testComAsync();
        }
    }
}
