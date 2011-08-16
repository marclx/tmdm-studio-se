/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.mdm.repository.model.mdmserverobject.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.talend.mdm.repository.model.mdmserverobject.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.mdm.repository.model.mdmserverobject.MdmserverobjectPackage
 * @generated
 */
public class MdmserverobjectAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static MdmserverobjectPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MdmserverobjectAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = MdmserverobjectPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MdmserverobjectSwitch<Adapter> modelSwitch =
        new MdmserverobjectSwitch<Adapter>() {
            @Override
            public Adapter caseMDMServerObject(MDMServerObject object) {
                return createMDMServerObjectAdapter();
            }
            @Override
            public Adapter caseWSMenuE(WSMenuE object) {
                return createWSMenuEAdapter();
            }
            @Override
            public Adapter caseWSMenuEntryE(WSMenuEntryE object) {
                return createWSMenuEntryEAdapter();
            }
            @Override
            public Adapter caseWSMenuMenuEntriesDescriptionsE(WSMenuMenuEntriesDescriptionsE object) {
                return createWSMenuMenuEntriesDescriptionsEAdapter();
            }
            @Override
            public Adapter caseWSRoleE(WSRoleE object) {
                return createWSRoleEAdapter();
            }
            @Override
            public Adapter caseWSRoleSpecificationE(WSRoleSpecificationE object) {
                return createWSRoleSpecificationEAdapter();
            }
            @Override
            public Adapter caseWSRoleSpecificationInstanceE(WSRoleSpecificationInstanceE object) {
                return createWSRoleSpecificationInstanceEAdapter();
            }
            @Override
            public Adapter caseWSViewE(WSViewE object) {
                return createWSViewEAdapter();
            }
            @Override
            public Adapter caseWSWhereConditionE(WSWhereConditionE object) {
                return createWSWhereConditionEAdapter();
            }
            @Override
            public Adapter caseWSWhereOperatorE(WSWhereOperatorE object) {
                return createWSWhereOperatorEAdapter();
            }
            @Override
            public Adapter caseWSStringPredicateE(WSStringPredicateE object) {
                return createWSStringPredicateEAdapter();
            }
            @Override
            public Adapter caseWSDataModelE(WSDataModelE object) {
                return createWSDataModelEAdapter();
            }
            @Override
            public Adapter caseWSDataClusterE(WSDataClusterE object) {
                return createWSDataClusterEAdapter();
            }
            @Override
            public Adapter caseWSStoredProcedureE(WSStoredProcedureE object) {
                return createWSStoredProcedureEAdapter();
            }
            @Override
            public Adapter caseWSUniverseE(WSUniverseE object) {
                return createWSUniverseEAdapter();
            }
            @Override
            public Adapter caseWSUniverseXtentisObjectsRevisionIDsE(WSUniverseXtentisObjectsRevisionIDsE object) {
                return createWSUniverseXtentisObjectsRevisionIDsEAdapter();
            }
            @Override
            public Adapter caseWSUniverseItemsRevisionIDsE(WSUniverseItemsRevisionIDsE object) {
                return createWSUniverseItemsRevisionIDsEAdapter();
            }
            @Override
            public Adapter caseWSSynchronizationPlanE(WSSynchronizationPlanE object) {
                return createWSSynchronizationPlanEAdapter();
            }
            @Override
            public Adapter caseWSSynchronizationPlanItemsSynchronizationsE(WSSynchronizationPlanItemsSynchronizationsE object) {
                return createWSSynchronizationPlanItemsSynchronizationsEAdapter();
            }
            @Override
            public Adapter caseWSSynchronizationPlanXtentisObjectsSynchronizationsE(WSSynchronizationPlanXtentisObjectsSynchronizationsE object) {
                return createWSSynchronizationPlanXtentisObjectsSynchronizationsEAdapter();
            }
            @Override
            public Adapter caseWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE(WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE object) {
                return createWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsEAdapter();
            }
            @Override
            public Adapter caseWSBooleanE(WSBooleanE object) {
                return createWSBooleanEAdapter();
            }
            @Override
            public Adapter caseWSWorkflowDeployE(WSWorkflowDeployE object) {
                return createWSWorkflowDeployEAdapter();
            }
            @Override
            public Adapter caseWSTransformerV2E(WSTransformerV2E object) {
                return createWSTransformerV2EAdapter();
            }
            @Override
            public Adapter caseWSTransformerProcessStepE(WSTransformerProcessStepE object) {
                return createWSTransformerProcessStepEAdapter();
            }
            @Override
            public Adapter caseWSTransformerVariablesMappingE(WSTransformerVariablesMappingE object) {
                return createWSTransformerVariablesMappingEAdapter();
            }
            @Override
            public Adapter caseWSTypedContentE(WSTypedContentE object) {
                return createWSTypedContentEAdapter();
            }
            @Override
            public Adapter caseWSByteArrayE(WSByteArrayE object) {
                return createWSByteArrayEAdapter();
            }
            @Override
            public Adapter caseWSRoutingRuleE(WSRoutingRuleE object) {
                return createWSRoutingRuleEAdapter();
            }
            @Override
            public Adapter caseWSRoutingRuleExpressionE(WSRoutingRuleExpressionE object) {
                return createWSRoutingRuleExpressionEAdapter();
            }
            @Override
            public Adapter caseWSRoutingRuleOperatorE(WSRoutingRuleOperatorE object) {
                return createWSRoutingRuleOperatorEAdapter();
            }
            @Override
            public Adapter caseWSJobModelE(WSJobModelE object) {
                return createWSJobModelEAdapter();
            }
            @Override
            public Adapter caseWSEventManagerE(WSEventManagerE object) {
                return createWSEventManagerEAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.MDMServerObject <em>MDM Server Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.MDMServerObject
     * @generated
     */
    public Adapter createMDMServerObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuE <em>WS Menu E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuE
     * @generated
     */
    public Adapter createWSMenuEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE <em>WS Menu Entry E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuEntryE
     * @generated
     */
    public Adapter createWSMenuEntryEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSMenuMenuEntriesDescriptionsE <em>WS Menu Menu Entries Descriptions E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSMenuMenuEntriesDescriptionsE
     * @generated
     */
    public Adapter createWSMenuMenuEntriesDescriptionsEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoleE <em>WS Role E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoleE
     * @generated
     */
    public Adapter createWSRoleEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationE <em>WS Role Specification E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationE
     * @generated
     */
    public Adapter createWSRoleSpecificationEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationInstanceE <em>WS Role Specification Instance E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoleSpecificationInstanceE
     * @generated
     */
    public Adapter createWSRoleSpecificationInstanceEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSViewE <em>WS View E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSViewE
     * @generated
     */
    public Adapter createWSViewEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE <em>WS Where Condition E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSWhereConditionE
     * @generated
     */
    public Adapter createWSWhereConditionEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSWhereOperatorE <em>WS Where Operator E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSWhereOperatorE
     * @generated
     */
    public Adapter createWSWhereOperatorEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSStringPredicateE <em>WS String Predicate E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSStringPredicateE
     * @generated
     */
    public Adapter createWSStringPredicateEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSDataModelE <em>WS Data Model E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSDataModelE
     * @generated
     */
    public Adapter createWSDataModelEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSDataClusterE <em>WS Data Cluster E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSDataClusterE
     * @generated
     */
    public Adapter createWSDataClusterEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSStoredProcedureE <em>WS Stored Procedure E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSStoredProcedureE
     * @generated
     */
    public Adapter createWSStoredProcedureEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSUniverseE <em>WS Universe E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSUniverseE
     * @generated
     */
    public Adapter createWSUniverseEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSUniverseXtentisObjectsRevisionIDsE <em>WS Universe Xtentis Objects Revision IDs E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSUniverseXtentisObjectsRevisionIDsE
     * @generated
     */
    public Adapter createWSUniverseXtentisObjectsRevisionIDsEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSUniverseItemsRevisionIDsE <em>WS Universe Items Revision IDs E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSUniverseItemsRevisionIDsE
     * @generated
     */
    public Adapter createWSUniverseItemsRevisionIDsEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE <em>WS Synchronization Plan E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanE
     * @generated
     */
    public Adapter createWSSynchronizationPlanEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE <em>WS Synchronization Plan Items Synchronizations E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanItemsSynchronizationsE
     * @generated
     */
    public Adapter createWSSynchronizationPlanItemsSynchronizationsEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsE <em>WS Synchronization Plan Xtentis Objects Synchronizations E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsE
     * @generated
     */
    public Adapter createWSSynchronizationPlanXtentisObjectsSynchronizationsEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE <em>WS Synchronization Plan Xtentis Objects Synchronizations Synchronizations E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsE
     * @generated
     */
    public Adapter createWSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizationsEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSBooleanE <em>WS Boolean E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSBooleanE
     * @generated
     */
    public Adapter createWSBooleanEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSWorkflowDeployE <em>WS Workflow Deploy E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSWorkflowDeployE
     * @generated
     */
    public Adapter createWSWorkflowDeployEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSTransformerV2E <em>WS Transformer V2E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSTransformerV2E
     * @generated
     */
    public Adapter createWSTransformerV2EAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSTransformerProcessStepE <em>WS Transformer Process Step E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSTransformerProcessStepE
     * @generated
     */
    public Adapter createWSTransformerProcessStepEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSTransformerVariablesMappingE <em>WS Transformer Variables Mapping E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSTransformerVariablesMappingE
     * @generated
     */
    public Adapter createWSTransformerVariablesMappingEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSTypedContentE <em>WS Typed Content E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSTypedContentE
     * @generated
     */
    public Adapter createWSTypedContentEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSByteArrayE <em>WS Byte Array E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSByteArrayE
     * @generated
     */
    public Adapter createWSByteArrayEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoutingRuleE <em>WS Routing Rule E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoutingRuleE
     * @generated
     */
    public Adapter createWSRoutingRuleEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoutingRuleExpressionE <em>WS Routing Rule Expression E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoutingRuleExpressionE
     * @generated
     */
    public Adapter createWSRoutingRuleExpressionEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSRoutingRuleOperatorE <em>WS Routing Rule Operator E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSRoutingRuleOperatorE
     * @generated
     */
    public Adapter createWSRoutingRuleOperatorEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSJobModelE <em>WS Job Model E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSJobModelE
     * @generated
     */
    public Adapter createWSJobModelEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.mdm.repository.model.mdmserverobject.WSEventManagerE <em>WS Event Manager E</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.mdm.repository.model.mdmserverobject.WSEventManagerE
     * @generated
     */
    public Adapter createWSEventManagerEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //MdmserverobjectAdapterFactory