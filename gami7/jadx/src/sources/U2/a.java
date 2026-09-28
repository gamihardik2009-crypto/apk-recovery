package U2;

import java.util.ArrayList;
import java.util.HashSet;
import n2.C0970v;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5792a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5793b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f5794c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5795d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5796e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5797f;

    public a(String str) {
        z2.h.f(str, "serialName");
        this.f5792a = str;
        this.f5793b = new ArrayList();
        this.f5794c = new HashSet();
        this.f5795d = new ArrayList();
        this.f5796e = new ArrayList();
        this.f5797f = new ArrayList();
    }

    public static void a(a aVar, String str, f fVar) {
        C0970v c0970v = C0970v.f9165h;
        aVar.getClass();
        z2.h.f(fVar, "descriptor");
        if (aVar.f5794c.add(str)) {
            aVar.f5793b.add(str);
            aVar.f5795d.add(fVar);
            aVar.f5796e.add(c0970v);
            aVar.f5797f.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + aVar.f5792a).toString());
    }
}
