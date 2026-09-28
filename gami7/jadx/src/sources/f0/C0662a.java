package f0;

import c0.C0603v;
import e0.InterfaceC0654d;
import m2.C0880v;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0662a extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final C0662a f7586j = new C0662a(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0662a f7587k = new C0662a(1, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7588i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0662a(int i2, int i3) {
        super(i2);
        this.f7588i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f7588i) {
            case 0:
                break;
            default:
                r1.w0(C0603v.f7276f, 0L, (r17 & 4) != 0 ? InterfaceC0654d.v0(((InterfaceC0654d) obj).e(), 0L) : 0L, 1.0f, e0.g.f7556a, null, (r17 & 64) != 0 ? 3 : 0);
                break;
        }
        return C0880v.f8657a;
    }
}
