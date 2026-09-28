package t2;

import java.lang.reflect.Method;
import z2.h;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1269a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f10666a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        h.c(methods);
        int length = methods.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                break;
            }
            Method method2 = methods[i2];
            if (h.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                h.e(parameterTypes, "getParameterTypes(...)");
                if (h.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i2++;
        }
        f10666a = method;
        int length2 = methods.length;
        for (int i3 = 0; i3 < length2 && !h.a(methods[i3].getName(), "getSuppressed"); i3++) {
        }
    }
}
