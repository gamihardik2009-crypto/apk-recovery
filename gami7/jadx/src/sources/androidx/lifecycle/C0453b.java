package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6880a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f6881b;

    public C0453b(HashMap hashMap) {
        this.f6881b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0465n enumC0465n = (EnumC0465n) entry.getValue();
            List list = (List) this.f6880a.get(enumC0465n);
            if (list == null) {
                list = new ArrayList();
                this.f6880a.put(enumC0465n, list);
            }
            list.add((C0454c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0454c c0454c = (C0454c) list.get(size);
                c0454c.getClass();
                try {
                    int i2 = c0454c.f6883a;
                    Method method = c0454c.f6884b;
                    if (i2 == 0) {
                        method.invoke(obj, null);
                    } else if (i2 == 1) {
                        method.invoke(obj, interfaceC0470t);
                    } else if (i2 == 2) {
                        method.invoke(obj, interfaceC0470t, enumC0465n);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to call observer method", e4.getCause());
                }
            }
        }
    }
}
