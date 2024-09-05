package org.apache.catalina.session;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SessionManager {

    private static final Map<String, Session> SESSIONS = new HashMap<>();

    public static void add(final Session session) {
        SESSIONS.put(session.getId(), session);
    }

    public static Session findSession(final String id) throws IOException {
        return SESSIONS.get(id);
    }

    public static void remove(final Session session) {
        SESSIONS.remove(session.getId());
    }

    private SessionManager() {
    }
}
