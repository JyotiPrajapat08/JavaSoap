
package my.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the my.interfaces package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertUsers_QNAME = new QName("http://interfaces.my/", "insertUsers");
    private final static QName _GetAllUsers_QNAME = new QName("http://interfaces.my/", "getAllUsers");
    private final static QName _GetAllBakedGoodsResponse_QNAME = new QName("http://interfaces.my/", "getAllBakedGoodsResponse");
    private final static QName _UpdatedBakedGoods_QNAME = new QName("http://interfaces.my/", "updatedBakedGoods");
    private final static QName _UpdatedBakedGoodsResponse_QNAME = new QName("http://interfaces.my/", "updatedBakedGoodsResponse");
    private final static QName _DeleteBakedGoods_QNAME = new QName("http://interfaces.my/", "deleteBakedGoods");
    private final static QName _UpdatedUserResponse_QNAME = new QName("http://interfaces.my/", "updatedUserResponse");
    private final static QName _UpdatedUser_QNAME = new QName("http://interfaces.my/", "updatedUser");
    private final static QName _GetAllBakedGoods_QNAME = new QName("http://interfaces.my/", "getAllBakedGoods");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://interfaces.my/", "getAllUsersResponse");
    private final static QName _GetLogin_QNAME = new QName("http://interfaces.my/", "getLogin");
    private final static QName _InsertBakedGoodsResponse_QNAME = new QName("http://interfaces.my/", "insertBakedGoodsResponse");
    private final static QName _InsertBakedGoods_QNAME = new QName("http://interfaces.my/", "insertBakedGoods");
    private final static QName _DeleteUser_QNAME = new QName("http://interfaces.my/", "deleteUser");
    private final static QName _DeleteBakedGoodsResponse_QNAME = new QName("http://interfaces.my/", "deleteBakedGoodsResponse");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://interfaces.my/", "deleteUserResponse");
    private final static QName _GetLoginResponse_QNAME = new QName("http://interfaces.my/", "getLoginResponse");
    private final static QName _InsertUsersResponse_QNAME = new QName("http://interfaces.my/", "insertUsersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: my.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link InsertUsers }
     * 
     */
    public InsertUsers createInsertUsers() {
        return new InsertUsers();
    }

    /**
     * Create an instance of {@link GetAllBakedGoodsResponse }
     * 
     */
    public GetAllBakedGoodsResponse createGetAllBakedGoodsResponse() {
        return new GetAllBakedGoodsResponse();
    }

    /**
     * Create an instance of {@link UpdatedBakedGoodsResponse }
     * 
     */
    public UpdatedBakedGoodsResponse createUpdatedBakedGoodsResponse() {
        return new UpdatedBakedGoodsResponse();
    }

    /**
     * Create an instance of {@link UpdatedBakedGoods }
     * 
     */
    public UpdatedBakedGoods createUpdatedBakedGoods() {
        return new UpdatedBakedGoods();
    }

    /**
     * Create an instance of {@link UpdatedUser }
     * 
     */
    public UpdatedUser createUpdatedUser() {
        return new UpdatedUser();
    }

    /**
     * Create an instance of {@link UpdatedUserResponse }
     * 
     */
    public UpdatedUserResponse createUpdatedUserResponse() {
        return new UpdatedUserResponse();
    }

    /**
     * Create an instance of {@link DeleteBakedGoods }
     * 
     */
    public DeleteBakedGoods createDeleteBakedGoods() {
        return new DeleteBakedGoods();
    }

    /**
     * Create an instance of {@link GetLogin }
     * 
     */
    public GetLogin createGetLogin() {
        return new GetLogin();
    }

    /**
     * Create an instance of {@link GetAllBakedGoods }
     * 
     */
    public GetAllBakedGoods createGetAllBakedGoods() {
        return new GetAllBakedGoods();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link InsertBakedGoodsResponse }
     * 
     */
    public InsertBakedGoodsResponse createInsertBakedGoodsResponse() {
        return new InsertBakedGoodsResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link InsertBakedGoods }
     * 
     */
    public InsertBakedGoods createInsertBakedGoods() {
        return new InsertBakedGoods();
    }

    /**
     * Create an instance of {@link GetLoginResponse }
     * 
     */
    public GetLoginResponse createGetLoginResponse() {
        return new GetLoginResponse();
    }

    /**
     * Create an instance of {@link InsertUsersResponse }
     * 
     */
    public InsertUsersResponse createInsertUsersResponse() {
        return new InsertUsersResponse();
    }

    /**
     * Create an instance of {@link DeleteBakedGoodsResponse }
     * 
     */
    public DeleteBakedGoodsResponse createDeleteBakedGoodsResponse() {
        return new DeleteBakedGoodsResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link BakedGoods }
     * 
     */
    public BakedGoods createBakedGoods() {
        return new BakedGoods();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "insertUsers")
    public JAXBElement<InsertUsers> createInsertUsers(InsertUsers value) {
        return new JAXBElement<InsertUsers>(_InsertUsers_QNAME, InsertUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBakedGoodsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllBakedGoodsResponse")
    public JAXBElement<GetAllBakedGoodsResponse> createGetAllBakedGoodsResponse(GetAllBakedGoodsResponse value) {
        return new JAXBElement<GetAllBakedGoodsResponse>(_GetAllBakedGoodsResponse_QNAME, GetAllBakedGoodsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatedBakedGoods }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "updatedBakedGoods")
    public JAXBElement<UpdatedBakedGoods> createUpdatedBakedGoods(UpdatedBakedGoods value) {
        return new JAXBElement<UpdatedBakedGoods>(_UpdatedBakedGoods_QNAME, UpdatedBakedGoods.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatedBakedGoodsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "updatedBakedGoodsResponse")
    public JAXBElement<UpdatedBakedGoodsResponse> createUpdatedBakedGoodsResponse(UpdatedBakedGoodsResponse value) {
        return new JAXBElement<UpdatedBakedGoodsResponse>(_UpdatedBakedGoodsResponse_QNAME, UpdatedBakedGoodsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBakedGoods }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "deleteBakedGoods")
    public JAXBElement<DeleteBakedGoods> createDeleteBakedGoods(DeleteBakedGoods value) {
        return new JAXBElement<DeleteBakedGoods>(_DeleteBakedGoods_QNAME, DeleteBakedGoods.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatedUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "updatedUserResponse")
    public JAXBElement<UpdatedUserResponse> createUpdatedUserResponse(UpdatedUserResponse value) {
        return new JAXBElement<UpdatedUserResponse>(_UpdatedUserResponse_QNAME, UpdatedUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatedUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "updatedUser")
    public JAXBElement<UpdatedUser> createUpdatedUser(UpdatedUser value) {
        return new JAXBElement<UpdatedUser>(_UpdatedUser_QNAME, UpdatedUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBakedGoods }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllBakedGoods")
    public JAXBElement<GetAllBakedGoods> createGetAllBakedGoods(GetAllBakedGoods value) {
        return new JAXBElement<GetAllBakedGoods>(_GetAllBakedGoods_QNAME, GetAllBakedGoods.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getLogin")
    public JAXBElement<GetLogin> createGetLogin(GetLogin value) {
        return new JAXBElement<GetLogin>(_GetLogin_QNAME, GetLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertBakedGoodsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "insertBakedGoodsResponse")
    public JAXBElement<InsertBakedGoodsResponse> createInsertBakedGoodsResponse(InsertBakedGoodsResponse value) {
        return new JAXBElement<InsertBakedGoodsResponse>(_InsertBakedGoodsResponse_QNAME, InsertBakedGoodsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertBakedGoods }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "insertBakedGoods")
    public JAXBElement<InsertBakedGoods> createInsertBakedGoods(InsertBakedGoods value) {
        return new JAXBElement<InsertBakedGoods>(_InsertBakedGoods_QNAME, InsertBakedGoods.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBakedGoodsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "deleteBakedGoodsResponse")
    public JAXBElement<DeleteBakedGoodsResponse> createDeleteBakedGoodsResponse(DeleteBakedGoodsResponse value) {
        return new JAXBElement<DeleteBakedGoodsResponse>(_DeleteBakedGoodsResponse_QNAME, DeleteBakedGoodsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getLoginResponse")
    public JAXBElement<GetLoginResponse> createGetLoginResponse(GetLoginResponse value) {
        return new JAXBElement<GetLoginResponse>(_GetLoginResponse_QNAME, GetLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "insertUsersResponse")
    public JAXBElement<InsertUsersResponse> createInsertUsersResponse(InsertUsersResponse value) {
        return new JAXBElement<InsertUsersResponse>(_InsertUsersResponse_QNAME, InsertUsersResponse.class, null, value);
    }

}
