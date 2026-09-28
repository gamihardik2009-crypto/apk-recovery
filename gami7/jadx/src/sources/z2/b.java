package z2;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class b implements F2.a, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public transient F2.a f11889h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f11890i;

    /* renamed from: j, reason: collision with root package name */
    public final Class f11891j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11892k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11893l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f11894m;

    public b(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f11890i = obj;
        this.f11891j = cls;
        this.f11892k = str;
        this.f11893l = str2;
        this.f11894m = z3;
    }

    public abstract F2.a a();

    public final c b() {
        Class cls = this.f11891j;
        if (cls == null) {
            return null;
        }
        if (!this.f11894m) {
            return t.a(cls);
        }
        t.f11910a.getClass();
        return new l(cls);
    }
}
