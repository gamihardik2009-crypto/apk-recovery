package y1;

import J2.r;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.example.bulksmsscheduler.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n2.AbstractC0946A;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1399a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C1399a f11489d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f11490e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f11493c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f11492b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11491a = new HashMap();

    public C1399a(Context context) {
        this.f11493c = context.getApplicationContext();
    }

    public static C1399a c(Context context) {
        if (f11489d == null) {
            synchronized (f11490e) {
                try {
                    if (f11489d == null) {
                        f11489d = new C1399a(context);
                    }
                } finally {
                }
            }
        }
        return f11489d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f11493c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f11492b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC1400b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e3) {
                throw new r(e3);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (AbstractC0946A.l()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f11491a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC1400b interfaceC1400b = (InterfaceC1400b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a3 = interfaceC1400b.a();
                if (!a3.isEmpty()) {
                    for (Class cls2 : a3) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC1400b.b(this.f11493c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new r(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
