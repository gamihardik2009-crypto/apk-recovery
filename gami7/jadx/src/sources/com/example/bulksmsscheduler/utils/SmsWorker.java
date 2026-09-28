package com.example.bulksmsscheduler.utils;

import B1.t;
import T0.d;
import T0.e;
import T0.f;
import T0.g;
import T0.i;
import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import j.C0751g;
import java.util.ArrayList;
import java.util.Iterator;
import z2.h;

/* loaded from: classes.dex */
public final class SmsWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h.f(context, "context");
        h.f(workerParameters, "workerParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0341 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x02f4 -> B:16:0x02f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0326 -> B:15:0x004a). Please report as a decompilation issue!!! */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(q2.InterfaceC1073d r28) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.bulksmsscheduler.utils.SmsWorker.f(q2.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.app.Notification$BubbleMetadata, android.net.Uri, java.lang.CharSequence, java.lang.CharSequence[], java.lang.String, java.lang.Throwable, long[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // androidx.work.CoroutineWorker
    public final Object g() {
        ?? r5;
        Bundle bundle;
        Context context = this.f301h;
        Object systemService = context.getSystemService("notification");
        h.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(new NotificationChannel("sms_worker_channel", "SMS Scheduler Service", 2));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Notification notification = new Notification();
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        ArrayList arrayList4 = new ArrayList();
        CharSequence subSequence = "Sending SMS".length() > 5120 ? "Sending SMS".subSequence(0, 5120) : "Sending SMS";
        CharSequence subSequence2 = "Bulk SMS Scheduler is processing messages".length() > 5120 ? "Bulk SMS Scheduler is processing messages".subSequence(0, 5120) : "Bulk SMS Scheduler is processing messages";
        notification.icon = R.drawable.ic_dialog_info;
        new ArrayList();
        Bundle bundle2 = new Bundle();
        int i2 = Build.VERSION.SDK_INT;
        Notification.Builder a3 = T0.h.a(context, "sms_worker_channel");
        a3.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(subSequence).setContentText(subSequence2).setContentInfo(null).setContentIntent(null).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        f.b(a3, null);
        a3.setSubText(null).setUsesChronometer(false).setPriority(0);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            t.w(it.next());
            throw null;
        }
        a3.setShowWhen(true);
        d.i(a3, false);
        d.g(a3, null);
        d.j(a3, null);
        d.h(a3, false);
        e.b(a3, null);
        e.c(a3, 0);
        e.f(a3, 0);
        e.d(a3, null);
        e.e(a3, notification.sound, notification.audioAttributes);
        if (i2 < 28) {
            ArrayList arrayList5 = new ArrayList(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                t.w(it2.next());
                throw null;
            }
            C0751g c0751g = new C0751g(arrayList4.size() + arrayList5.size());
            c0751g.addAll(arrayList5);
            c0751g.addAll(arrayList4);
            arrayList4 = new ArrayList(c0751g);
        }
        if (!arrayList4.isEmpty()) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                e.a(a3, (String) it3.next());
            }
        }
        if (arrayList3.size() > 0) {
            bundle = new Bundle();
            Bundle bundle3 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle3 == null) {
                bundle3 = new Bundle();
            }
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            if (arrayList3.size() > 0) {
                Integer.toString(0);
                t.w(arrayList3.get(0));
                new Bundle();
                throw null;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            bundle.putBundle("android.car.EXTENSIONS", bundle3);
            bundle2.putBundle("android.car.EXTENSIONS", bundle4);
            r5 = 0;
        } else {
            r5 = 0;
            bundle = null;
        }
        int i3 = Build.VERSION.SDK_INT;
        a3.setExtras(bundle);
        g.e(a3, r5);
        T0.h.b(a3, 0);
        T0.h.e(a3, r5);
        T0.h.f(a3, r5);
        T0.h.g(a3, 0L);
        T0.h.d(a3, 0);
        if (!TextUtils.isEmpty("sms_worker_channel")) {
            a3.setSound(r5).setDefaults(0).setLights(0, 0, 0).setVibrate(r5);
        }
        if (i3 >= 28) {
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                t.w(it4.next());
                throw r5;
            }
        }
        if (i3 >= 29) {
            i.a(a3, true);
            i.b(a3, r5);
        }
        Notification build = a3.build();
        h.e(build, "build(...)");
        return new B1.i(1, build, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.content.Context r11, Q1.p r12, q2.InterfaceC1073d r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.bulksmsscheduler.utils.SmsWorker.h(android.content.Context, Q1.p, q2.d):java.lang.Object");
    }
}
