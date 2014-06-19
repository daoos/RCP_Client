/**
 */
package org.hive2hive.rcp.client.model.filetree;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.hive2hive.rcp.client.model.filetree.FileTreeFactory
 * @model kind="package"
 * @generated
 */
public interface FileTreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filetree";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://filetree/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "filetree";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FileTreePackage eINSTANCE = org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hive2hive.rcp.client.model.filetree.impl.TreeElementImpl <em>Tree Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hive2hive.rcp.client.model.filetree.impl.TreeElementImpl
	 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getTreeElement()
	 * @generated
	 */
	int TREE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT__PATH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT__ACCESS_RIGHTS = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT__FILE = 4;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT__VERSIONS = 5;

	/**
	 * The number of structural features of the '<em>Tree Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.hive2hive.rcp.client.model.filetree.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hive2hive.rcp.client.model.filetree.impl.ContainerImpl
	 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PATH = TREE_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = TREE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PARENT = TREE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ACCESS_RIGHTS = TREE_ELEMENT__ACCESS_RIGHTS;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FILE = TREE_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VERSIONS = TREE_ELEMENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CHILDREN = TREE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = TREE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hive2hive.rcp.client.model.filetree.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hive2hive.rcp.client.model.filetree.impl.TreeImpl
	 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getTree()
	 * @generated
	 */
	int TREE = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__PATH = CONTAINER__PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__PARENT = CONTAINER__PARENT;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ACCESS_RIGHTS = CONTAINER__ACCESS_RIGHTS;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__FILE = CONTAINER__FILE;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__VERSIONS = CONTAINER__VERSIONS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__CHILDREN = CONTAINER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ELEMENTS = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hive2hive.rcp.client.model.filetree.impl.DirectoryImpl <em>Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hive2hive.rcp.client.model.filetree.impl.DirectoryImpl
	 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getDirectory()
	 * @generated
	 */
	int DIRECTORY = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__PATH = CONTAINER__PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__PARENT = CONTAINER__PARENT;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__ACCESS_RIGHTS = CONTAINER__ACCESS_RIGHTS;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__FILE = CONTAINER__FILE;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__VERSIONS = CONTAINER__VERSIONS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__CHILDREN = CONTAINER__CHILDREN;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hive2hive.rcp.client.model.filetree.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hive2hive.rcp.client.model.filetree.impl.FileImpl
	 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = TREE_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = TREE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PARENT = TREE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Access Rights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ACCESS_RIGHTS = TREE_ELEMENT__ACCESS_RIGHTS;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE = TREE_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__VERSIONS = TREE_ELEMENT__VERSIONS;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = TREE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hive2hive.rcp.client.model.filetree.impl.PathToTreeElementMapImpl <em>Path To Tree Element Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hive2hive.rcp.client.model.filetree.impl.PathToTreeElementMapImpl
	 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getPathToTreeElementMap()
	 * @generated
	 */
	int PATH_TO_TREE_ELEMENT_MAP = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TO_TREE_ELEMENT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TO_TREE_ELEMENT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Path To Tree Element Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TO_TREE_ELEMENT_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.hive2hive.rcp.client.model.filetree.impl.AccessRightImpl <em>Access Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hive2hive.rcp.client.model.filetree.impl.AccessRightImpl
	 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getAccessRight()
	 * @generated
	 */
	int ACCESS_RIGHT = 6;

	/**
	 * The feature id for the '<em><b>Read Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RIGHT__READ_PERMISSION = 0;

	/**
	 * The feature id for the '<em><b>Write Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RIGHT__WRITE_PERMISSION = 1;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RIGHT__USER_ID = 2;

	/**
	 * The number of structural features of the '<em>Access Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RIGHT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link java.lang.Comparable<Version> <em>Version Comparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Comparable<Version>
	 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getVersionComparable()
	 * @generated
	 */
	int VERSION_COMPARABLE = 8;

	/**
	 * The number of structural features of the '<em>Version Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_COMPARABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hive2hive.rcp.client.model.filetree.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hive2hive.rcp.client.model.filetree.impl.VersionImpl
	 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 7;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__INDEX = VERSION_COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__SIZE = VERSION_COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__TIME_STAMP = VERSION_COMPARABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = VERSION_COMPARABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '<em>Path</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.nio.file.Path
	 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getPath()
	 * @generated
	 */
	int PATH = 9;

	/**
	 * The meta object id for the '<em>Java Io File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getJavaIoFile()
	 * @generated
	 */
	int JAVA_IO_FILE = 10;


	/**
	 * Returns the meta object for class '{@link org.hive2hive.rcp.client.model.filetree.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.Tree
	 * @generated
	 */
	EClass getTree();

	/**
	 * Returns the meta object for the map '{@link org.hive2hive.rcp.client.model.filetree.Tree#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Elements</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.Tree#getElements()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_Elements();

	/**
	 * Returns the meta object for class '{@link org.hive2hive.rcp.client.model.filetree.TreeElement <em>Tree Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Element</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.TreeElement
	 * @generated
	 */
	EClass getTreeElement();

	/**
	 * Returns the meta object for the attribute '{@link org.hive2hive.rcp.client.model.filetree.TreeElement#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.TreeElement#getPath()
	 * @see #getTreeElement()
	 * @generated
	 */
	EAttribute getTreeElement_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.hive2hive.rcp.client.model.filetree.TreeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.TreeElement#getName()
	 * @see #getTreeElement()
	 * @generated
	 */
	EAttribute getTreeElement_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.hive2hive.rcp.client.model.filetree.TreeElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.TreeElement#getParent()
	 * @see #getTreeElement()
	 * @generated
	 */
	EReference getTreeElement_Parent();

	/**
	 * Returns the meta object for the reference list '{@link org.hive2hive.rcp.client.model.filetree.TreeElement#getAccessRights <em>Access Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Access Rights</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.TreeElement#getAccessRights()
	 * @see #getTreeElement()
	 * @generated
	 */
	EReference getTreeElement_AccessRights();

	/**
	 * Returns the meta object for the attribute '{@link org.hive2hive.rcp.client.model.filetree.TreeElement#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.TreeElement#getFile()
	 * @see #getTreeElement()
	 * @generated
	 */
	EAttribute getTreeElement_File();

	/**
	 * Returns the meta object for the reference list '{@link org.hive2hive.rcp.client.model.filetree.TreeElement#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Versions</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.TreeElement#getVersions()
	 * @see #getTreeElement()
	 * @generated
	 */
	EReference getTreeElement_Versions();

	/**
	 * Returns the meta object for class '{@link org.hive2hive.rcp.client.model.filetree.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.Directory
	 * @generated
	 */
	EClass getDirectory();

	/**
	 * Returns the meta object for class '{@link org.hive2hive.rcp.client.model.filetree.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for class '{@link org.hive2hive.rcp.client.model.filetree.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.hive2hive.rcp.client.model.filetree.Container#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.Container#getChildren()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Children();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Path To Tree Element Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path To Tree Element Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.hive2hive.rcp.client.model.filetree.Path" keyRequired="true"
	 *        valueType="org.hive2hive.rcp.client.model.filetree.TreeElement" valueRequired="true"
	 * @generated
	 */
	EClass getPathToTreeElementMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPathToTreeElementMap()
	 * @generated
	 */
	EAttribute getPathToTreeElementMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPathToTreeElementMap()
	 * @generated
	 */
	EReference getPathToTreeElementMap_Value();

	/**
	 * Returns the meta object for class '{@link org.hive2hive.rcp.client.model.filetree.AccessRight <em>Access Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Right</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.AccessRight
	 * @generated
	 */
	EClass getAccessRight();

	/**
	 * Returns the meta object for the attribute '{@link org.hive2hive.rcp.client.model.filetree.AccessRight#isReadPermission <em>Read Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Permission</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.AccessRight#isReadPermission()
	 * @see #getAccessRight()
	 * @generated
	 */
	EAttribute getAccessRight_ReadPermission();

	/**
	 * Returns the meta object for the attribute '{@link org.hive2hive.rcp.client.model.filetree.AccessRight#isWritePermission <em>Write Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Permission</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.AccessRight#isWritePermission()
	 * @see #getAccessRight()
	 * @generated
	 */
	EAttribute getAccessRight_WritePermission();

	/**
	 * Returns the meta object for the attribute '{@link org.hive2hive.rcp.client.model.filetree.AccessRight#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.AccessRight#getUserId()
	 * @see #getAccessRight()
	 * @generated
	 */
	EAttribute getAccessRight_UserId();

	/**
	 * Returns the meta object for class '{@link org.hive2hive.rcp.client.model.filetree.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.hive2hive.rcp.client.model.filetree.Version#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.Version#getIndex()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.hive2hive.rcp.client.model.filetree.Version#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.Version#getSize()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.hive2hive.rcp.client.model.filetree.Version#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see org.hive2hive.rcp.client.model.filetree.Version#getTimeStamp()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_TimeStamp();

	/**
	 * Returns the meta object for class '{@link java.lang.Comparable<Version> <em>Version Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Comparable</em>'.
	 * @see java.lang.Comparable<Version>
	 * @model instanceClass="java.lang.Comparable<Version>"
	 * @generated
	 */
	EClass getVersionComparable();

	/**
	 * Returns the meta object for data type '{@link java.nio.file.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Path</em>'.
	 * @see java.nio.file.Path
	 * @model instanceClass="java.nio.file.Path"
	 * @generated
	 */
	EDataType getPath();

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>Java Io File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Io File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EDataType getJavaIoFile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FileTreeFactory getFileTreeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.hive2hive.rcp.client.model.filetree.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hive2hive.rcp.client.model.filetree.impl.TreeImpl
		 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getTree()
		 * @generated
		 */
		EClass TREE = eINSTANCE.getTree();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__ELEMENTS = eINSTANCE.getTree_Elements();

		/**
		 * The meta object literal for the '{@link org.hive2hive.rcp.client.model.filetree.impl.TreeElementImpl <em>Tree Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hive2hive.rcp.client.model.filetree.impl.TreeElementImpl
		 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getTreeElement()
		 * @generated
		 */
		EClass TREE_ELEMENT = eINSTANCE.getTreeElement();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_ELEMENT__PATH = eINSTANCE.getTreeElement_Path();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_ELEMENT__NAME = eINSTANCE.getTreeElement_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_ELEMENT__PARENT = eINSTANCE.getTreeElement_Parent();

		/**
		 * The meta object literal for the '<em><b>Access Rights</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_ELEMENT__ACCESS_RIGHTS = eINSTANCE.getTreeElement_AccessRights();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_ELEMENT__FILE = eINSTANCE.getTreeElement_File();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_ELEMENT__VERSIONS = eINSTANCE.getTreeElement_Versions();

		/**
		 * The meta object literal for the '{@link org.hive2hive.rcp.client.model.filetree.impl.DirectoryImpl <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hive2hive.rcp.client.model.filetree.impl.DirectoryImpl
		 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getDirectory()
		 * @generated
		 */
		EClass DIRECTORY = eINSTANCE.getDirectory();

		/**
		 * The meta object literal for the '{@link org.hive2hive.rcp.client.model.filetree.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hive2hive.rcp.client.model.filetree.impl.FileImpl
		 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '{@link org.hive2hive.rcp.client.model.filetree.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hive2hive.rcp.client.model.filetree.impl.ContainerImpl
		 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CHILDREN = eINSTANCE.getContainer_Children();

		/**
		 * The meta object literal for the '{@link org.hive2hive.rcp.client.model.filetree.impl.PathToTreeElementMapImpl <em>Path To Tree Element Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hive2hive.rcp.client.model.filetree.impl.PathToTreeElementMapImpl
		 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getPathToTreeElementMap()
		 * @generated
		 */
		EClass PATH_TO_TREE_ELEMENT_MAP = eINSTANCE.getPathToTreeElementMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_TO_TREE_ELEMENT_MAP__KEY = eINSTANCE.getPathToTreeElementMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_TO_TREE_ELEMENT_MAP__VALUE = eINSTANCE.getPathToTreeElementMap_Value();

		/**
		 * The meta object literal for the '{@link org.hive2hive.rcp.client.model.filetree.impl.AccessRightImpl <em>Access Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hive2hive.rcp.client.model.filetree.impl.AccessRightImpl
		 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getAccessRight()
		 * @generated
		 */
		EClass ACCESS_RIGHT = eINSTANCE.getAccessRight();

		/**
		 * The meta object literal for the '<em><b>Read Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_RIGHT__READ_PERMISSION = eINSTANCE.getAccessRight_ReadPermission();

		/**
		 * The meta object literal for the '<em><b>Write Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_RIGHT__WRITE_PERMISSION = eINSTANCE.getAccessRight_WritePermission();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_RIGHT__USER_ID = eINSTANCE.getAccessRight_UserId();

		/**
		 * The meta object literal for the '{@link org.hive2hive.rcp.client.model.filetree.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hive2hive.rcp.client.model.filetree.impl.VersionImpl
		 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__INDEX = eINSTANCE.getVersion_Index();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__SIZE = eINSTANCE.getVersion_Size();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__TIME_STAMP = eINSTANCE.getVersion_TimeStamp();

		/**
		 * The meta object literal for the '{@link java.lang.Comparable<Version> <em>Version Comparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Comparable<Version>
		 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getVersionComparable()
		 * @generated
		 */
		EClass VERSION_COMPARABLE = eINSTANCE.getVersionComparable();

		/**
		 * The meta object literal for the '<em>Path</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.nio.file.Path
		 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getPath()
		 * @generated
		 */
		EDataType PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em>Java Io File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see org.hive2hive.rcp.client.model.filetree.impl.FileTreePackageImpl#getJavaIoFile()
		 * @generated
		 */
		EDataType JAVA_IO_FILE = eINSTANCE.getJavaIoFile();

	}

} //FileTreePackage
