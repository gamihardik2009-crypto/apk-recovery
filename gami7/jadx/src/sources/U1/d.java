package U1;

import J2.B;
import J2.H;
import O2.e;
import Q1.p;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telephony.SmsManager;
import com.example.bulksmsscheduler.SmsApplication;
import z2.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5787a;

    /* renamed from: b, reason: collision with root package name */
    public final p f5788b;

    /* renamed from: c, reason: collision with root package name */
    public final SmsManager f5789c;

    /* renamed from: d, reason: collision with root package name */
    public final e f5790d;

    /* renamed from: e, reason: collision with root package name */
    public final I1.d f5791e;

    public d(SmsApplication smsApplication, p pVar) {
        h.f(pVar, "repository");
        this.f5787a = smsApplication;
        this.f5788b = pVar;
        this.f5789c = Build.VERSION.SDK_INT >= 31 ? (SmsManager) smsApplication.getSystemService(SmsManager.class) : SmsManager.getDefault();
        this.f5790d = B.a(H.f4357b);
        this.f5791e = new I1.d(1, this);
    }

    public static final PendingIntent a(d dVar, String str, int i2) {
        dVar.getClass();
        Intent intent = new Intent("SMS_SENT");
        intent.putExtra("scheduleId", str);
        intent.putExtra("partIndex", i2);
        Context context = dVar.f5787a;
        intent.setPackage(context.getPackageName());
        PendingIntent broadcast = PendingIntent.getBroadcast(context, (str + i2).hashCode(), intent, 201326592);
        h.e(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}
