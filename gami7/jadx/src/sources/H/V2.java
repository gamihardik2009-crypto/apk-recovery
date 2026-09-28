package H;

import e0.InterfaceC0654d;
import m2.C0880v;

/* loaded from: classes.dex */
public final class V2 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f2079i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2080j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.a f2081k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2082l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2(long j3, int i2, y2.a aVar, long j4) {
        super(1);
        this.f2079i = j3;
        this.f2080j = i2;
        this.f2081k = aVar;
        this.f2082l = j4;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        InterfaceC0654d interfaceC0654d = (InterfaceC0654d) obj;
        float b3 = b0.f.b(interfaceC0654d.e());
        X2.b(interfaceC0654d, 1.0f, this.f2079i, b3, this.f2080j);
        X2.b(interfaceC0654d, ((Number) this.f2081k.c()).floatValue(), this.f2082l, b3, this.f2080j);
        return C0880v.f8657a;
    }
}
