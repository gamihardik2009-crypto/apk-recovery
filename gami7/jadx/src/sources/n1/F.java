package n1;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f9014b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9015a = new LinkedHashMap();

    public final void a(D d3) {
        z2.h.f(d3, "navigator");
        String k3 = E.k(d3.getClass());
        if (k3.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        LinkedHashMap linkedHashMap = this.f9015a;
        D d4 = (D) linkedHashMap.get(k3);
        if (z2.h.a(d4, d3)) {
            return;
        }
        boolean z3 = false;
        if (d4 != null && d4.f9013b) {
            z3 = true;
        }
        if (!(!z3)) {
            throw new IllegalStateException(("Navigator " + d3 + " is replacing an already attached " + d4).toString());
        }
        if (!d3.f9013b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + d3 + " is already attached to another NavController").toString());
    }

    public final D b(String str) {
        z2.h.f(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        D d3 = (D) this.f9015a.get(str);
        if (d3 != null) {
            return d3;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }
}
