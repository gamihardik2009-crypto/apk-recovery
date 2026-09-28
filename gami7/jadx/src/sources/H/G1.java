package H;

import e0.InterfaceC0654d;
import m2.C0880v;

/* loaded from: classes.dex */
public final class G1 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f1504i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f1505j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(float f3, long j3) {
        super(1);
        this.f1504i = f3;
        this.f1505j = j3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        InterfaceC0654d interfaceC0654d = (InterfaceC0654d) obj;
        float f3 = this.f1504i;
        float f4 = 2;
        interfaceC0654d.v(this.f1505j, K1.f.e(0.0f, interfaceC0654d.P(f3) / f4), K1.f.e(b0.f.d(interfaceC0654d.e()), interfaceC0654d.P(f3) / f4), interfaceC0654d.P(f3), (r22 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
        return C0880v.f8657a;
    }
}
