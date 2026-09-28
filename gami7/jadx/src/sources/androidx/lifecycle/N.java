package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m2.C0865g;
import n2.AbstractC0946A;
import u1.InterfaceC1327d;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f6847f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6848a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6849b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f6850c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f6851d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1327d f6852e;

    public N(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f6848a = linkedHashMap;
        this.f6849b = new LinkedHashMap();
        this.f6850c = new LinkedHashMap();
        this.f6851d = new LinkedHashMap();
        this.f6852e = new M(0, this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(N n3) {
        z2.h.f(n3, "this$0");
        for (Map.Entry entry : AbstractC0946A.u(n3.f6849b).entrySet()) {
            n3.b(((InterfaceC1327d) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = n3.f6848a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return B2.a.i(new C0865g("keys", arrayList), new C0865g("values", arrayList2));
    }

    public final void b(Object obj, String str) {
        z2.h.f(str, "key");
        if (obj != null) {
            Class[] clsArr = f6847f;
            for (int i2 = 0; i2 < 29; i2++) {
                Class cls = clsArr[i2];
                z2.h.c(cls);
                if (!cls.isInstance(obj)) {
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.f6850c.get(str);
        C0475y c0475y = obj2 instanceof C0475y ? (C0475y) obj2 : null;
        if (c0475y != null) {
            c0475y.a(obj);
        } else {
            this.f6848a.put(str, obj);
        }
        M2.I i3 = (M2.I) this.f6851d.get(str);
        if (i3 == null) {
            return;
        }
        ((M2.d0) i3).k(obj);
    }

    public N() {
        this.f6848a = new LinkedHashMap();
        this.f6849b = new LinkedHashMap();
        this.f6850c = new LinkedHashMap();
        this.f6851d = new LinkedHashMap();
        this.f6852e = new M(0, this);
    }
}
