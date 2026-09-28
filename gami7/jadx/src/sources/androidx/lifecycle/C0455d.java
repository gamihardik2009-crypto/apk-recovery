package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0455d f6885c = new C0455d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6886a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6887b = new HashMap();

    public static void b(HashMap hashMap, C0454c c0454c, EnumC0465n enumC0465n, Class cls) {
        EnumC0465n enumC0465n2 = (EnumC0465n) hashMap.get(c0454c);
        if (enumC0465n2 == null || enumC0465n == enumC0465n2) {
            if (enumC0465n2 == null) {
                hashMap.put(c0454c, enumC0465n);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0454c.f6884b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0465n2 + ", new value " + enumC0465n);
    }

    public final C0453b a(Class cls, Method[] methodArr) {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f6886a;
        if (superclass != null) {
            C0453b c0453b = (C0453b) hashMap2.get(superclass);
            if (c0453b == null) {
                c0453b = a(superclass, null);
            }
            hashMap.putAll(c0453b.f6881b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0453b c0453b2 = (C0453b) hashMap2.get(cls2);
            if (c0453b2 == null) {
                c0453b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0453b2.f6881b.entrySet()) {
                b(hashMap, (C0454c) entry.getKey(), (EnumC0465n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e3) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            InterfaceC0476z interfaceC0476z = (InterfaceC0476z) method.getAnnotation(InterfaceC0476z.class);
            if (interfaceC0476z != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!InterfaceC0470t.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                EnumC0465n value = interfaceC0476z.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0465n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0465n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0454c(i2, method), value, cls);
                z3 = true;
            }
        }
        C0453b c0453b3 = new C0453b(hashMap);
        hashMap2.put(cls, c0453b3);
        this.f6887b.put(cls, Boolean.valueOf(z3));
        return c0453b3;
    }
}
