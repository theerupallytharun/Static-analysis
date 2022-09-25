else if (javax.naming.Context.class.isAssignableFrom(d)) {
    // JNDI context
    Context context = (Context) d.getDeclaredConstructor().newInstance();
    DataSource ds = (DataSource) context.lookup(url);
    if (StringUtils.isNullOrEmpty(user) && StringUtils.isNullOrEmpty(password)) {
        return ds.getConnection();
    }
    return ds.getConnection(user, password);
}

h2Server = Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082");
h2Server.start();

0=JHipster H2 (Memory)|org.h2.Driver|jdbc\:h2\:mem\:jhbomtest|jhbomtest
webAllowOthers=true
webPort=8092
webSSL=false