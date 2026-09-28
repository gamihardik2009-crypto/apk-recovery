package z2;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import m2.InterfaceC0861c;

/* loaded from: classes.dex */
public abstract class v {
    public static Collection a(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof A2.a) || (abstractCollection instanceof A2.b)) {
            return abstractCollection;
        }
        f(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static List b(Object obj) {
        if ((obj instanceof A2.a) && !(obj instanceof A2.c)) {
            f(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e3) {
            h.i(e3, v.class.getName());
            throw e3;
        }
    }

    public static Map c(AbstractMap abstractMap) {
        if (!(abstractMap instanceof A2.a) || (abstractMap instanceof A2.e)) {
            return abstractMap;
        }
        f(abstractMap, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void d(int i2, Object obj) {
        if (obj == null || e(i2, obj)) {
            return;
        }
        f(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static boolean e(int i2, Object obj) {
        int i3;
        if (!(obj instanceof InterfaceC0861c)) {
            return false;
        }
        if (obj instanceof e) {
            i3 = ((e) obj).e();
        } else if (obj instanceof y2.a) {
            i3 = 0;
        } else if (obj instanceof y2.c) {
            i3 = 1;
        } else if (obj instanceof y2.e) {
            i3 = 2;
        } else if (obj instanceof y2.f) {
            i3 = 3;
        } else if (obj instanceof y2.g) {
            i3 = 4;
        } else {
            boolean z3 = obj instanceof R.a;
            i3 = z3 ? 5 : obj instanceof y2.h ? 6 : obj instanceof y2.i ? 7 : z3 ? 8 : z3 ? 9 : z3 ? 10 : z3 ? 11 : z3 ? 13 : z3 ? 14 : z3 ? 15 : z3 ? 16 : z3 ? 17 : z3 ? 18 : z3 ? 19 : z3 ? 20 : z3 ? 21 : -1;
        }
        return i3 == i2;
    }

    public static void f(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        h.i(classCastException, v.class.getName());
        throw classCastException;
    }
}
