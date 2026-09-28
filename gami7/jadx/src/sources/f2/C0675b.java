package f2;

import android.content.Context;
import com.example.bulksmsscheduler.utils.SmsWorker;
import java.time.LocalDateTime;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675b extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public Context f7706k;

    /* renamed from: l, reason: collision with root package name */
    public LocalDateTime f7707l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f7708m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SmsWorker f7709n;

    /* renamed from: o, reason: collision with root package name */
    public int f7710o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0675b(SmsWorker smsWorker, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f7709n = smsWorker;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f7708m = obj;
        this.f7710o |= Integer.MIN_VALUE;
        return this.f7709n.h(null, null, this);
    }
}
