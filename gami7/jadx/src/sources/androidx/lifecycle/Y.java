package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import k1.C0784b;

/* loaded from: classes.dex */
public final class Y extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public static Y f6876c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1.b f6877d = new C1.b(18, false);

    /* renamed from: b, reason: collision with root package name */
    public final Application f6878b;

    public Y(Application application) {
        this.f6878b = application;
    }

    @Override // androidx.lifecycle.a0, androidx.lifecycle.Z
    public final X a(Class cls) {
        Application application = this.f6878b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.a0, androidx.lifecycle.Z
    public final X b(Class cls, C0784b c0784b) {
        if (this.f6878b != null) {
            return a(cls);
        }
        Application application = (Application) ((LinkedHashMap) c0784b.f1200h).get(f6877d);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC0452a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return l0.c.w(cls);
    }

    public final X d(Class cls, Application application) {
        if (!AbstractC0452a.class.isAssignableFrom(cls)) {
            return l0.c.w(cls);
        }
        try {
            X x2 = (X) cls.getConstructor(Application.class).newInstance(application);
            z2.h.e(x2, "{\n                try {\n…          }\n            }");
            return x2;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        }
    }
}
