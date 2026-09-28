package A0;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f124a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.e f125b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f126c;

    public x(String str, y2.e eVar) {
        this.f124a = str;
        this.f125b = eVar;
    }

    public final void a(k kVar, Object obj) {
        kVar.e(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f124a;
    }

    public /* synthetic */ x(String str) {
        this(str, s.f88u);
    }

    public x(String str, boolean z3, y2.e eVar) {
        this(str, eVar);
        this.f126c = z3;
    }
}
