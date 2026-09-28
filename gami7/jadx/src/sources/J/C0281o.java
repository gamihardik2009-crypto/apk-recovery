package J;

/* renamed from: J.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4174b;

    public /* synthetic */ C0281o(int i2, Object obj) {
        this.f4173a = i2;
        this.f4174b = obj;
    }

    public final void a() {
        switch (this.f4173a) {
            case 0:
                C0285q c0285q = (C0285q) this.f4174b;
                c0285q.f4219z--;
                break;
            default:
                T.v vVar = (T.v) this.f4174b;
                vVar.f5743j--;
                break;
        }
    }

    public final void b() {
        switch (this.f4173a) {
            case 0:
                ((C0285q) this.f4174b).f4219z++;
                break;
            default:
                ((T.v) this.f4174b).f5743j++;
                break;
        }
    }
}
