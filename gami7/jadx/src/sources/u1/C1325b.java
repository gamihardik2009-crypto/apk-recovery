package u1;

import android.os.Bundle;
import androidx.lifecycle.EnumC0465n;
import androidx.lifecycle.InterfaceC0460i;
import androidx.lifecycle.InterfaceC0470t;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.X;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.r;
import b.AbstractActivityC0489m;
import b.C0484h;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import z2.h;

/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325b implements r {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11259h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f11260i;

    public /* synthetic */ C1325b(int i2, Object obj) {
        this.f11259h = i2;
        this.f11260i = obj;
    }

    @Override // androidx.lifecycle.r
    public final void d(InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n) {
        switch (this.f11259h) {
            case 0:
                if (enumC0465n != EnumC0465n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0470t.e().f(this);
                f fVar = (f) this.f11260i;
                Bundle a3 = fVar.c().a("androidx.savedstate.Restarter");
                if (a3 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a3.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C1325b.class.getClassLoader()).asSubclass(InterfaceC1326c.class);
                        h.e(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                h.e(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(fVar instanceof c0)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                }
                                b0 d3 = ((c0) fVar).d();
                                e c3 = fVar.c();
                                LinkedHashMap linkedHashMap = d3.f6882a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    h.f(str2, "key");
                                    X x2 = (X) linkedHashMap.get(str2);
                                    h.c(x2);
                                    Q.a(x2, c3, fVar.e());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    c3.d();
                                }
                            } catch (Exception e3) {
                                throw new RuntimeException("Failed to instantiate " + str, e3);
                            }
                        } catch (NoSuchMethodException e4) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                        }
                    } catch (ClassNotFoundException e5) {
                        throw new RuntimeException("Class " + str + " wasn't found", e5);
                    }
                }
                return;
            case 1:
                new HashMap();
                InterfaceC0460i[] interfaceC0460iArr = (InterfaceC0460i[]) this.f11260i;
                if (interfaceC0460iArr.length > 0) {
                    InterfaceC0460i interfaceC0460i = interfaceC0460iArr[0];
                    throw null;
                }
                if (interfaceC0460iArr.length <= 0) {
                    return;
                }
                InterfaceC0460i interfaceC0460i2 = interfaceC0460iArr[0];
                throw null;
            case 2:
                if (enumC0465n != EnumC0465n.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0465n).toString());
                }
                interfaceC0470t.e().f(this);
                ((S) this.f11260i).b();
                return;
            default:
                AbstractActivityC0489m abstractActivityC0489m = (AbstractActivityC0489m) this.f11260i;
                if (abstractActivityC0489m.f7005l == null) {
                    C0484h c0484h = (C0484h) abstractActivityC0489m.getLastNonConfigurationInstance();
                    if (c0484h != null) {
                        abstractActivityC0489m.f7005l = c0484h.f6981a;
                    }
                    if (abstractActivityC0489m.f7005l == null) {
                        abstractActivityC0489m.f7005l = new b0();
                    }
                }
                abstractActivityC0489m.f7001h.f(this);
                return;
        }
    }

    public C1325b(f fVar) {
        this.f11259h = 0;
        h.f(fVar, "owner");
        this.f11260i = fVar;
    }
}
