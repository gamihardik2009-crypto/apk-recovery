package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import n2.AbstractC0959k;
import n2.AbstractC0962n;
import n2.AbstractC0963o;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static final List f6870a = AbstractC0963o.v(Application.class, N.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f6871b = AbstractC0962n.l(N.class);

    public static final Constructor a(Class cls, List list) {
        z2.h.f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        z2.h.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            z2.h.e(parameterTypes, "constructor.parameterTypes");
            List A3 = AbstractC0959k.A(parameterTypes);
            if (z2.h.a(list, A3)) {
                return constructor;
            }
            if (list.size() == A3.size() && A3.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final X b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (X) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Failed to access " + cls, e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e5.getCause());
        }
    }
}
