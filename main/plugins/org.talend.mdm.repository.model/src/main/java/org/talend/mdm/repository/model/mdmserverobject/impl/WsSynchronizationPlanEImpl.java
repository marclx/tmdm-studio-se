/**
 * <copyright> </copyright>
 *
 * $Id$
 */
package org.talend.mdm.repository.model.mdmserverobject.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.mdm.repository.model.mdmserverobject.MdmserverobjectPackage;
import org.talend.mdm.repository.model.mdmserverobject.WsSynchronizationPlanE;
import org.talend.mdm.repository.model.mdmserverobject.WsSynchronizationPlanItemsSynchronizationsE;
import org.talend.mdm.repository.model.mdmserverobject.WsSynchronizationPlanXtentisObjectsSynchronizationsE;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Ws Synchronization Plan E</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.mdm.repository.model.mdmserverobject.impl.WsSynchronizationPlanEImpl#getRemoteSystemName <em>
 * Remote System Name</em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmserverobject.impl.WsSynchronizationPlanEImpl#getRemoteSystemURL <em>
 * Remote System URL</em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmserverobject.impl.WsSynchronizationPlanEImpl#getRemoteSystemUsername
 * <em>Remote System Username</em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmserverobject.impl.WsSynchronizationPlanEImpl#getRemoteSystemPassword
 * <em>Remote System Password</em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmserverobject.impl.WsSynchronizationPlanEImpl#getTisURL <em>Tis URL
 * </em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmserverobject.impl.WsSynchronizationPlanEImpl#getTisUsername <em>Tis
 * Username</em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmserverobject.impl.WsSynchronizationPlanEImpl#getTisPassword <em>Tis
 * Password</em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmserverobject.impl.WsSynchronizationPlanEImpl#getTisParameters <em>Tis
 * Parameters</em>}</li>
 * <li>
 * {@link org.talend.mdm.repository.model.mdmserverobject.impl.WsSynchronizationPlanEImpl#getXtentisObjectsSynchronizations
 * <em>Xtentis Objects Synchronizations</em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmserverobject.impl.WsSynchronizationPlanEImpl#getItemsSynchronizations
 * <em>Items Synchronizations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WsSynchronizationPlanEImpl extends MDMServerObjectImpl implements WsSynchronizationPlanE {

    /**
     * The default value of the '{@link #getRemoteSystemName() <em>Remote System Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRemoteSystemName()
     * @generated
     * @ordered
     */
    protected static final String REMOTE_SYSTEM_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemoteSystemName() <em>Remote System Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRemoteSystemName()
     * @generated
     * @ordered
     */
    protected String remoteSystemName = REMOTE_SYSTEM_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getRemoteSystemURL() <em>Remote System URL</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRemoteSystemURL()
     * @generated
     * @ordered
     */
    protected static final String REMOTE_SYSTEM_URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemoteSystemURL() <em>Remote System URL</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getRemoteSystemURL()
     * @generated
     * @ordered
     */
    protected String remoteSystemURL = REMOTE_SYSTEM_URL_EDEFAULT;

    /**
     * The default value of the '{@link #getRemoteSystemUsername() <em>Remote System Username</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRemoteSystemUsername()
     * @generated
     * @ordered
     */
    protected static final String REMOTE_SYSTEM_USERNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemoteSystemUsername() <em>Remote System Username</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRemoteSystemUsername()
     * @generated
     * @ordered
     */
    protected String remoteSystemUsername = REMOTE_SYSTEM_USERNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getRemoteSystemPassword() <em>Remote System Password</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRemoteSystemPassword()
     * @generated
     * @ordered
     */
    protected static final String REMOTE_SYSTEM_PASSWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemoteSystemPassword() <em>Remote System Password</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getRemoteSystemPassword()
     * @generated
     * @ordered
     */
    protected String remoteSystemPassword = REMOTE_SYSTEM_PASSWORD_EDEFAULT;

    /**
     * The default value of the '{@link #getTisURL() <em>Tis URL</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getTisURL()
     * @generated
     * @ordered
     */
    protected static final String TIS_URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTisURL() <em>Tis URL</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getTisURL()
     * @generated
     * @ordered
     */
    protected String tisURL = TIS_URL_EDEFAULT;

    /**
     * The default value of the '{@link #getTisUsername() <em>Tis Username</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getTisUsername()
     * @generated
     * @ordered
     */
    protected static final String TIS_USERNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTisUsername() <em>Tis Username</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getTisUsername()
     * @generated
     * @ordered
     */
    protected String tisUsername = TIS_USERNAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTisPassword() <em>Tis Password</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getTisPassword()
     * @generated
     * @ordered
     */
    protected static final String TIS_PASSWORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTisPassword() <em>Tis Password</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getTisPassword()
     * @generated
     * @ordered
     */
    protected String tisPassword = TIS_PASSWORD_EDEFAULT;

    /**
     * The default value of the '{@link #getTisParameters() <em>Tis Parameters</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getTisParameters()
     * @generated
     * @ordered
     */
    protected static final String TIS_PARAMETERS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTisParameters() <em>Tis Parameters</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getTisParameters()
     * @generated
     * @ordered
     */
    protected String tisParameters = TIS_PARAMETERS_EDEFAULT;

    /**
     * The cached value of the '{@link #getXtentisObjectsSynchronizations() <em>Xtentis Objects Synchronizations</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getXtentisObjectsSynchronizations()
     * @generated
     * @ordered
     */
    protected EList<WsSynchronizationPlanXtentisObjectsSynchronizationsE> xtentisObjectsSynchronizations;

    /**
     * The cached value of the '{@link #getItemsSynchronizations() <em>Items Synchronizations</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getItemsSynchronizations()
     * @generated
     * @ordered
     */
    protected EList<WsSynchronizationPlanItemsSynchronizationsE> itemsSynchronizations;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected WsSynchronizationPlanEImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MdmserverobjectPackage.Literals.WS_SYNCHRONIZATION_PLAN_E;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getRemoteSystemName() {
        return remoteSystemName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setRemoteSystemName(String newRemoteSystemName) {
        String oldRemoteSystemName = remoteSystemName;
        remoteSystemName = newRemoteSystemName;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_NAME, oldRemoteSystemName, remoteSystemName));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getRemoteSystemURL() {
        return remoteSystemURL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setRemoteSystemURL(String newRemoteSystemURL) {
        String oldRemoteSystemURL = remoteSystemURL;
        remoteSystemURL = newRemoteSystemURL;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_URL, oldRemoteSystemURL, remoteSystemURL));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getRemoteSystemUsername() {
        return remoteSystemUsername;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setRemoteSystemUsername(String newRemoteSystemUsername) {
        String oldRemoteSystemUsername = remoteSystemUsername;
        remoteSystemUsername = newRemoteSystemUsername;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_USERNAME, oldRemoteSystemUsername,
                    remoteSystemUsername));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getRemoteSystemPassword() {
        return remoteSystemPassword;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setRemoteSystemPassword(String newRemoteSystemPassword) {
        String oldRemoteSystemPassword = remoteSystemPassword;
        remoteSystemPassword = newRemoteSystemPassword;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_PASSWORD, oldRemoteSystemPassword,
                    remoteSystemPassword));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getTisURL() {
        return tisURL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setTisURL(String newTisURL) {
        String oldTisURL = tisURL;
        tisURL = newTisURL;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_URL,
                    oldTisURL, tisURL));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getTisUsername() {
        return tisUsername;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setTisUsername(String newTisUsername) {
        String oldTisUsername = tisUsername;
        tisUsername = newTisUsername;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_USERNAME,
                    oldTisUsername, tisUsername));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getTisPassword() {
        return tisPassword;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setTisPassword(String newTisPassword) {
        String oldTisPassword = tisPassword;
        tisPassword = newTisPassword;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_PASSWORD,
                    oldTisPassword, tisPassword));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getTisParameters() {
        return tisParameters;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setTisParameters(String newTisParameters) {
        String oldTisParameters = tisParameters;
        tisParameters = newTisParameters;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_PARAMETERS, oldTisParameters, tisParameters));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<WsSynchronizationPlanXtentisObjectsSynchronizationsE> getXtentisObjectsSynchronizations() {
        if (xtentisObjectsSynchronizations == null) {
            xtentisObjectsSynchronizations = new EObjectContainmentEList<WsSynchronizationPlanXtentisObjectsSynchronizationsE>(
                    WsSynchronizationPlanXtentisObjectsSynchronizationsE.class, this,
                    MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__XTENTIS_OBJECTS_SYNCHRONIZATIONS);
        }
        return xtentisObjectsSynchronizations;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<WsSynchronizationPlanItemsSynchronizationsE> getItemsSynchronizations() {
        if (itemsSynchronizations == null) {
            itemsSynchronizations = new EObjectContainmentEList<WsSynchronizationPlanItemsSynchronizationsE>(
                    WsSynchronizationPlanItemsSynchronizationsE.class, this,
                    MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__ITEMS_SYNCHRONIZATIONS);
        }
        return itemsSynchronizations;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__XTENTIS_OBJECTS_SYNCHRONIZATIONS:
            return ((InternalEList<?>) getXtentisObjectsSynchronizations()).basicRemove(otherEnd, msgs);
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__ITEMS_SYNCHRONIZATIONS:
            return ((InternalEList<?>) getItemsSynchronizations()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_NAME:
            return getRemoteSystemName();
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_URL:
            return getRemoteSystemURL();
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_USERNAME:
            return getRemoteSystemUsername();
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_PASSWORD:
            return getRemoteSystemPassword();
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_URL:
            return getTisURL();
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_USERNAME:
            return getTisUsername();
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_PASSWORD:
            return getTisPassword();
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_PARAMETERS:
            return getTisParameters();
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__XTENTIS_OBJECTS_SYNCHRONIZATIONS:
            return getXtentisObjectsSynchronizations();
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__ITEMS_SYNCHRONIZATIONS:
            return getItemsSynchronizations();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_NAME:
            setRemoteSystemName((String) newValue);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_URL:
            setRemoteSystemURL((String) newValue);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_USERNAME:
            setRemoteSystemUsername((String) newValue);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_PASSWORD:
            setRemoteSystemPassword((String) newValue);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_URL:
            setTisURL((String) newValue);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_USERNAME:
            setTisUsername((String) newValue);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_PASSWORD:
            setTisPassword((String) newValue);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_PARAMETERS:
            setTisParameters((String) newValue);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__XTENTIS_OBJECTS_SYNCHRONIZATIONS:
            getXtentisObjectsSynchronizations().clear();
            getXtentisObjectsSynchronizations().addAll(
                    (Collection<? extends WsSynchronizationPlanXtentisObjectsSynchronizationsE>) newValue);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__ITEMS_SYNCHRONIZATIONS:
            getItemsSynchronizations().clear();
            getItemsSynchronizations().addAll((Collection<? extends WsSynchronizationPlanItemsSynchronizationsE>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_NAME:
            setRemoteSystemName(REMOTE_SYSTEM_NAME_EDEFAULT);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_URL:
            setRemoteSystemURL(REMOTE_SYSTEM_URL_EDEFAULT);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_USERNAME:
            setRemoteSystemUsername(REMOTE_SYSTEM_USERNAME_EDEFAULT);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_PASSWORD:
            setRemoteSystemPassword(REMOTE_SYSTEM_PASSWORD_EDEFAULT);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_URL:
            setTisURL(TIS_URL_EDEFAULT);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_USERNAME:
            setTisUsername(TIS_USERNAME_EDEFAULT);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_PASSWORD:
            setTisPassword(TIS_PASSWORD_EDEFAULT);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_PARAMETERS:
            setTisParameters(TIS_PARAMETERS_EDEFAULT);
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__XTENTIS_OBJECTS_SYNCHRONIZATIONS:
            getXtentisObjectsSynchronizations().clear();
            return;
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__ITEMS_SYNCHRONIZATIONS:
            getItemsSynchronizations().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_NAME:
            return REMOTE_SYSTEM_NAME_EDEFAULT == null ? remoteSystemName != null : !REMOTE_SYSTEM_NAME_EDEFAULT
                    .equals(remoteSystemName);
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_URL:
            return REMOTE_SYSTEM_URL_EDEFAULT == null ? remoteSystemURL != null : !REMOTE_SYSTEM_URL_EDEFAULT
                    .equals(remoteSystemURL);
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_USERNAME:
            return REMOTE_SYSTEM_USERNAME_EDEFAULT == null ? remoteSystemUsername != null : !REMOTE_SYSTEM_USERNAME_EDEFAULT
                    .equals(remoteSystemUsername);
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__REMOTE_SYSTEM_PASSWORD:
            return REMOTE_SYSTEM_PASSWORD_EDEFAULT == null ? remoteSystemPassword != null : !REMOTE_SYSTEM_PASSWORD_EDEFAULT
                    .equals(remoteSystemPassword);
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_URL:
            return TIS_URL_EDEFAULT == null ? tisURL != null : !TIS_URL_EDEFAULT.equals(tisURL);
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_USERNAME:
            return TIS_USERNAME_EDEFAULT == null ? tisUsername != null : !TIS_USERNAME_EDEFAULT.equals(tisUsername);
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_PASSWORD:
            return TIS_PASSWORD_EDEFAULT == null ? tisPassword != null : !TIS_PASSWORD_EDEFAULT.equals(tisPassword);
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__TIS_PARAMETERS:
            return TIS_PARAMETERS_EDEFAULT == null ? tisParameters != null : !TIS_PARAMETERS_EDEFAULT.equals(tisParameters);
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__XTENTIS_OBJECTS_SYNCHRONIZATIONS:
            return xtentisObjectsSynchronizations != null && !xtentisObjectsSynchronizations.isEmpty();
        case MdmserverobjectPackage.WS_SYNCHRONIZATION_PLAN_E__ITEMS_SYNCHRONIZATIONS:
            return itemsSynchronizations != null && !itemsSynchronizations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (remoteSystemName: ");
        result.append(remoteSystemName);
        result.append(", remoteSystemURL: ");
        result.append(remoteSystemURL);
        result.append(", remoteSystemUsername: ");
        result.append(remoteSystemUsername);
        result.append(", remoteSystemPassword: ");
        result.append(remoteSystemPassword);
        result.append(", tisURL: ");
        result.append(tisURL);
        result.append(", tisUsername: ");
        result.append(tisUsername);
        result.append(", tisPassword: ");
        result.append(tisPassword);
        result.append(", tisParameters: ");
        result.append(tisParameters);
        result.append(')');
        return result.toString();
    }

    @Override
    public int getType() {
        return 19;
    }
} // WsSynchronizationPlanEImpl
